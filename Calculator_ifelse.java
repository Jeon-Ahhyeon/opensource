package makejava;
import java.util.Scanner;

public class Calculator_ifelse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,result;
		String op;
		
		System.out.printf("�Է�>> ");
		a=scanner.nextDouble();
		op=scanner.next();
		b=scanner.nextDouble();
		
		if(op.equals("+")) {
			result= a+b;
			System.out.println(a+op+b+" �� ��� ����� "+result);
		}
		else if(op.equals("-")) {
			result = a-b;
			System.out.println(a+op+b+" �� ��� ����� "+result);
		}
		else if(op.equals("*")){
			result = a*b;
			System.out.println(a+op+b+" �� ��� ����� "+result);
		}
		else if(op.equals("/")){
			if(a==0||b==0)
				System.out.println(a+"�� "+b+"�� ���� �� �����ϴ�.");
			else {
				result = a/b;
				System.out.println(a+op+b+" �� ��� ����� "+result);
			}
		}
		
		
		scanner.close();
	}
}
