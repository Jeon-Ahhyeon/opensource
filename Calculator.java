package makejava;
import java.util.Scanner;  //Scanner Ŭ���� �̿��ϱ� ���� �ۼ�

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,result;
		String op;
		
		System.out.printf("�Է�>> ");
		a=scanner.nextDouble();
		op=scanner.next();
		b=scanner.nextDouble();
		
		switch(op) {
		case "+":
			result= a+b;
			System.out.println(a+op+b+" �� ��� ����� "+result);

			break;
		case "-":
			result = a-b;
			System.out.println(a+op+b+" �� ��� ����� "+result);

			break;
		case "/":
			if(a==0||b==0)
			{
				System.out.println(a+"�� "+b+"�� ���� �� �����ϴ�.");
				break;
			}
			result = a/b;
			System.out.println(a+op+b+" �� ��� ����� "+result);

			break;
		case "*":
			result = a*b;
			System.out.println(a+op+b+" �� ��� ����� "+result);

			break;
		}
		scanner.close();
	}
	
	

}
