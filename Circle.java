package makejava;
import java.util.Scanner;  //Scanner 클래스 이용하기 위해 작성
public class Circle {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1,y1,x2,y2;
		double r1,r2,distance;
		
		System.out.printf("첫번째 원의 중심과 반지름을 입력: ");
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.printf("두번째 원의 중심과 반지름을 입력: ");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(distance>(r1+r2))
			System.out.println("두 원은 서로 겹치지 않는다.");
		else if(distance==(r1+r2))
			System.out.println("두 원은 서로 만난다.");
		else
			System.out.println("두 원은 서로 겹친다.");
		
		
		scanner.close();
	}

}
