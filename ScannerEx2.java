import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("연산>> ");
		float n1 = scanner.nextFloat();
		String Operator = scanner.next();
		float n2 = scanner.nextFloat();
		
		switch(Operator) {
		
		
		case "+" :
			System.out.println((int)n1+Operator+(int)n2+"의 계산 결과는 "+(int)(n1+n2));
			break;
	
			
		case "-" :
			System.out.println((int)n1+Operator+(int)n2+"의 계산 결과는 "+(int)(n1-n2));
			break;
		
			
		case "*" :
			System.out.println((int)n1+Operator+(int)n2+"의 계산 결과는 "+(int)(n1*n2));
			break;
		
			
		case "/" :
			if(n2==0)	{
				System.out.println("0으로 나눌 수 없습니다");
				break;
			}
			else	{
				System.out.println((int)n1+Operator+(int)n2+"의 계산 결과는 "+(int)(n1/n2));
				break;
			}
			
			
		default:
			System.out.println("연산자 오류입니다");
			break;
		}
		scanner.close();
		
		
	}
}