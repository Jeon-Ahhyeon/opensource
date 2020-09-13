package makejava;
import java.util.Scanner;

public class Calculator_ifelse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,result;
		String op;
		
		System.out.printf("입력>> ");
		a=scanner.nextDouble();
		op=scanner.next();
		b=scanner.nextDouble();
		
		if(op.equals("+")) {
			result= a+b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);
		}
		else if(op.equals("-")) {
			result = a-b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);
		}
		else if(op.equals("*")){
			result = a*b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);
		}
		else if(op.equals("/")){
			if(a==0||b==0)
				System.out.println(a+"를 "+b+"로 나눌 수 없습니다.");
			else {
				result = a/b;
				System.out.println(a+op+b+" 의 계산 결과는 "+result);
			}
		}
		
		
		scanner.close();
	}
}
