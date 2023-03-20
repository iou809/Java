import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("연산>> ");
		float n1 = scanner.nextFloat();
		String Operator = scanner.next();
		float n2 = scanner.nextFloat();



		if(Operator.equals("+")){
			System.out.println((int)(n1) + Operator + (int)(n2) + "의 계산 결과는 "+ (int)(n1+n2));
		}

		
		else if(Operator.equals("-")){
			System.out.println((int)(n1) + Operator + (int)(n2) + "의 계산 결과는 "+ (int)(n1-n2));
		}

		
		else if(Operator.equals("*")){
			System.out.println((int)(n1) + Operator + (int)(n2) + "의 계산 결과는 "+ (int)(n1*n2));
		}

		
		else if(Operator.equals("/")){
			System.out.println((int)(n1) + Operator + (int)(n2) + "의 계산 결과는 "+ (int)(n1/n2));
		}
		
		
		if(n2 == 0 && Operator.equals("/")){
			System.out.println("0으로 나눌 수 없습니다.");

		}
		scanner.close();
	}	
}
