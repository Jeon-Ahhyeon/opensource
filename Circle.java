package makejava;
import java.util.Scanner;  //Scanner Ŭ���� �̿��ϱ� ���� �ۼ�
public class Circle {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //scanner��ü ����
		int x1,y1,x2,y2;  //���� �߽� �Է¹��� ����
		double r1,r2,distance;  //�Է¹��� ���� �������� ����� ���� �Ÿ� ���� ����
		
		System.out.printf("ù��° ���� �߽ɰ� �������� �Է�: ");  //�ȳ��� ���
		x1=scanner.nextInt();  //scanner Ŭ������ �̿��Ͽ� ���� �߽ɰ� ������ �Է¹���
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.printf("�ι�° ���� �߽ɰ� �������� �Է�: ");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));  //���� �߽��� �̿��Ͽ� �Ÿ� ���ϱ�
		if(distance>(r1+r2))  //�Ÿ��� �� ���� �������� �պ��� ũ�� ��ġ�� ����
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");  
		else if(distance==(r1+r2)) //�Ÿ��� �� ���� �������� �հ� ���ٸ� �� ���� ������.  
			System.out.println("�� ���� ���� ������.");
		else  //�Ÿ��� �� ���� �������� �պ��� �۴ٸ� �� ���� ���� ��ģ��.
			System.out.println("�� ���� ���� ��ģ��.");
		
		
		scanner.close();
	}

}
