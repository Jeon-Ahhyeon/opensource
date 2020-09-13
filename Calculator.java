package makejava;
import java.util.Scanner;  //Scanner 클래스 이용하기 위해 작성

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,result;
		String op;
		
		System.out.printf("입력>> ");
		a=scanner.nextDouble();
		op=scanner.next();
		b=scanner.nextDouble();
		
		switch(op) {
		case "+":
			result= a+b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);

			break;
		case "-":
			result = a-b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);

			break;
		case "/":
			if(a==0||b==0)
			{
				System.out.println(a+"를 "+b+"로 나눌 수 없습니다.");
				break;
			}
			result = a/b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);

			break;
		case "*":
			result = a*b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);

			break;
		}
		scanner.close();
	}
	
	

}
