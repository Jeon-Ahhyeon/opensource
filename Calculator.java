package makejava;
/*
 * ����� : ���¼ҽ� ���� ������Ʈ
 * ������ : ���籸 ������
 * ������ : 2�� ����_��Ģ���� switch����
 * ������ : 2020.09.13
 * ��   �� : 2018068005
 * ��   ��  : ������
 * */
import java.util.Scanner;  //Scanner Ŭ���� �̿��ϱ� ���� �ۼ�

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //scanner��ü ����
		double a,b,result;  // �Է¹��� a,b �Ǽ��� ������� ������ result ����
		String op;  //��ȣ ����
		
		System.out.printf("�Է�>> ");  //�ȳ��� ���
		a=scanner.nextDouble();  //scannerŬ���� �̿��Ͽ� �Ǽ��� ��ȣ �Է�
		op=scanner.next();
		b=scanner.nextDouble();
		
		switch(op) {  //switch�� �̿��Ͽ� ��ȣ�� ���� ��� ����� �ٸ��� ��
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
