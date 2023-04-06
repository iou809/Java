import java.util.Scanner;

class Phone {
    private String name;
    private String tel;
    public Phone(String name, String tel){ 
        this.name = name; this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
    
}
public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone [] p;
        int i;
        System.out.print("인원수>>");
        int num = scanner.nextInt();
        p = new Phone[num];
        for(i=0; i<p.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            p[i] = new Phone(name, tel);
    }
        System.out.println("저장되었습니다...");
        while(true) {
            System.out.println("검색할 이름>>");
            String name = scanner.next();
            for(i=0; i<num; i++) {
                if(name.equals(p[i].getName())) {
                    System.out.println(name + "의 번호는 " + p[i].getTel() + " 입니다.");
                    break;
                }
            }
            if(name.equals("그만")) break;
            if (i == num) System.out.println(name + " 이 없습니다.");
        }
        scanner.close();
    }
}