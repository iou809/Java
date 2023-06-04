
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Server extends JFrame{
    private JTextArea textArea = new JTextArea();
    private Vector<String> wordVector = new Vector<String>();
    public Server(){
        super("���� ���� üũ ����");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(textArea);
        textArea.setEnabled(false);
        this.loadWord("words.txt");
        new ServerThread().start();

        setSize(500, 500);
        setVisible(true);
    }
    public void loadWord(String fileName){
        FileInputStream fileInputStream = null;
        BufferedReader in = null;
        String words;
        try{
            fileInputStream = new FileInputStream(fileName);
            in = new BufferedReader(new InputStreamReader(fileInputStream));
            while((words = in.readLine()) != null){
                wordVector.add(words);
                System.out.println(words);
            }
            textArea.append(fileName + "�б� �Ϸ�\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    class ServerThread extends Thread{
        @Override
        public void run(){
            ServerSocket listener = null;
            Socket socket = null;
            try{
                listener = new ServerSocket(9999);
                while (true){
                    socket = listener.accept();
                    textArea.append("Ŭ���̾�Ʈ �����\n");
                    new ServiceThread(socket).start();
                }

            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                if(listener != null) listener.close();
                if(socket != null) listener.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    class ServiceThread extends Thread{
        private BufferedReader in = null;
        private BufferedWriter out = null;
        private Socket socket;
        public ServiceThread(Socket socket){
            this.socket = socket;
            try{
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        @Override
        public void run(){
            String inputMessage, outputMessage;
            while(true){
                try{
                    inputMessage = in.readLine();
                    if(wordVector.contains(inputMessage)){
                        outputMessage = "YES";
                    }
                    else{
                        outputMessage = "NO";
                    }
                    textArea.append(inputMessage + "=" + outputMessage+"\n");
                    out.write(outputMessage + "\n");
                    out.flush();
                }catch (Exception e){
                    e.printStackTrace();
                    textArea.append("��������\n");
                    return;
                }
            }
        }
    }
    public static void main(String[] args){
        new Server();
    }
}