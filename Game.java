import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Options = {"가위","바위","보"};
        
        while (true) {
        	System.out.print("가위 바위 보!>>");
        	String User = scanner.next();
        	
        	if (User.equals("그만")) {
        		System.out.println("게임을 종료합니다...");
        		break;
        }
        	
        	
        	 int option = (int) (Math.random() * 3);
             String computer = Options[option];
                          
             if (User.equals(computer)) {
            	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "비겼습니다");
             }
            	
             else if (User.equals("가위")){
            	 if(computer.equals("보")) {
                	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "사용자가 이겼습니다.");
            	 }
            	 else {
                	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "컴퓨터가 이겼습니다.");
            	 }
             }
             else if (User.equals("바위")){
            	 if(computer.equals("가위")) {
                	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "사용자가 이겼습니다.");
            	 }
            	 else {
                	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "컴퓨터가 이겼습니다.");
            	 }
             }
             else if (User.equals("보")){
            	 if(computer.equals("바위")) {
                	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "사용자가 이겼습니다.");
            	 }
            	 else {
                	 System.out.println("사용자 = " + User + " , " + "컴퓨터 = " + computer + ", " + "컴퓨터가 이겼습니다.");
            	 }
             }
             else {
            	 System.out.println("입력이 잘못되었습니다");
             }
        }
        scanner.close();
    }
}