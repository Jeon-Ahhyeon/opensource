package makejava;
/*
 * 과목명 : 오픈소스 개발 프로젝트
 * 교수명 : 강재구 교수님
 * 과제명 : 2장 퀴즈_사칙연산 switch버전
 * 제출일 : 2020.09.13
 * 학   번 : 2018068005
 * 이   름  : 전아현
 * */
import java.util.Scanner;  //Scanner 클래스 이용하기 위해 작성

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //scanner객체 형성
		double a,b,result;  // 입력받을 a,b 실수와 결과값을 저장할 result 변수
		String op;  //기호 변수
		
		System.out.printf("입력>> ");  //안내문 출력
		a=scanner.nextDouble();  //scanner클래스 이용하여 실수와 기호 입력
		op=scanner.next();
		b=scanner.nextDouble();
		
		switch(op) {  //switch문 이용하여 기호에 따라 계산 방법을 다르게 함
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
