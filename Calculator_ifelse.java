package makejava;
/*
 * 과목명 : 오픈소스 개발 프로젝트
 * 교수명 : 강재구 교수님
 * 과제명 : 2장 퀴즈_사칙연산 ifelse버전
 * 제출일 : 2020.09.13
 * 학   번 : 2018068005
 * 이   름  : 전아현
 * */
import java.util.Scanner;  //Scanner 클래스 이용하여 입력받기 위해 작성

public class Calculator_ifelse {  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //scanner 객체 생성
		double a,b,result;  // 입력받은 실수 a,b와 결과값을 저장할 result 변수 선언
		String op;  //입력받은 기호 변수
		
		System.out.printf("입력>> ");  //안내문
		a=scanner.nextDouble();  //scanner 클래스 이용하여 변수 입력받음
		op=scanner.next();
		b=scanner.nextDouble();
		
		if(op.equals("+")) {  //if else 문을 이용하여 기호에 따라 계산하는 법을 바꿈
			result= a+b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);
		}
		else if(op.equals("-")) {
			result = a-b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);
		}
		else if(op.equals("*")){
			result = a*b;
			System.out.println(a+op+b+" 의 계산 결과는 "+result);
		}
		else if(op.equals("/")){
			if(a==0||b==0)
				System.out.println(a+"를 "+b+"로 나눌 수 없습니다.");
			else {
				result = a/b;
				System.out.println(a+op+b+" 의 계산 결과는 "+result);
			}
		}
		
		
		scanner.close();
	}
}
