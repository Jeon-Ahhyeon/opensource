package makejava;
/*
 * ����� : ���¼ҽ� ���� ������Ʈ
 * ������ : ���籸 ������
 * ������ : 2�� ����_��Ģ���� ifelse����
 * ������ : 2020.09.13
 * ��   �� : 2018068005
 * ��   ��  : ������
 * */
import java.util.Scanner;  //Scanner Ŭ���� �̿��Ͽ� �Է¹ޱ� ���� �ۼ�

public class Calculator_ifelse {  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //scanner ��ü ����
		double a,b,result;  // �Է¹��� �Ǽ� a,b�� ������� ������ result ���� ����
		String op;  //�Է¹��� ��ȣ ����
		
		System.out.printf("�Է�>> ");  //�ȳ���
		a=scanner.nextDouble();  //scanner Ŭ���� �̿��Ͽ� ���� �Է¹���
		op=scanner.next();
		b=scanner.nextDouble();
		
		if(op.equals("+")) {  //if else ���� �̿��Ͽ� ��ȣ�� ���� ����ϴ� ���� �ٲ�
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
