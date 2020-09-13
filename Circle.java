package makejava;
import java.util.Scanner;  //Scanner 클래스 이용하기 위해 작성
public class Circle {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //scanner객체 형성
		int x1,y1,x2,y2;  //원의 중심 입력받을 변수
		double r1,r2,distance;  //입력받은 원의 반지름과 계산할 원의 거리 변수 선언
		
		System.out.printf("첫번째 원의 중심과 반지름을 입력: ");  //안내문 출력
		x1=scanner.nextInt();  //scanner 클래스를 이용하여 원의 중심과 반지금 입력받음
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.printf("두번째 원의 중심과 반지름을 입력: ");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));  //원의 중심을 이용하여 거리 구하기
		if(distance>(r1+r2))  //거리가 두 원의 반지름의 합보다 크면 겹치지 않음
			System.out.println("두 원은 서로 겹치지 않는다.");  
		else if(distance==(r1+r2)) //거리가 두 원의 반지름의 합과 같다면 두 원은 만난다.  
			System.out.println("두 원은 서로 만난다.");
		else  //거리가 두 원의 반지름의 합보다 작다면 두 원은 서로 겹친다.
			System.out.println("두 원은 서로 겹친다.");
		
		
		scanner.close();
	}

}
