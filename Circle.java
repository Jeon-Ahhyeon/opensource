package makejava;
import java.util.Scanner;  //Scanner Ŭ���� �̿��ϱ� ���� �ۼ�
public class Circle {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1,y1,x2,y2;
		double r1,r2,distance;
		
		System.out.printf("ù��° ���� �߽ɰ� �������� �Է�: ");
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.printf("�ι�° ���� �߽ɰ� �������� �Է�: ");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(distance>(r1+r2))
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		else if(distance==(r1+r2))
			System.out.println("�� ���� ���� ������.");
		else
			System.out.println("�� ���� ���� ��ģ��.");
		
		
		scanner.close();
	}

}
