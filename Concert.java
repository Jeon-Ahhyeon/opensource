package project_4;
import java.util.Scanner;

class Sys{
	private Scanner scanner;
	private String S[];
	private String A[];
	private String B[];
	private int S_count,A_count,B_count;
	
	Sys(){
		S=new String [10];
		A=new String [10];
		B=new String [10];
		scanner= new Scanner(System.in);
		for(int i=0;i<10;i++) {
			S[i]="___";
			A[i]="___";
			B[i]="___";
		}
		S_count=0;
		A_count=0;
		B_count=0;
	}
	public void reservation() {
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3) >> ");
			int num = scanner.nextInt();
			if(num==1) {
				if(S_count!=10) {  //좌석이 다 예약이 되지 않은 경우 해당 타입 좌석의 예약을 받음
					System.out.print("S = ");
					reser_check(this.S);
					S_count++;  //예약된 좌석의 수를 하나 증가
					return;
				}
				else if(S_count==10){  //좌석이 꽉 찰 경우 다른 좌석 선택할 수 있도록 함
					System.out.println("해당 타입 좌석이 모두 예약되어 있습니다. 다른 좌석을 선택해주세요.");
				}
			}
			else if(num == 2){
				if(A_count!=10) {
					System.out.print("A = ");
					reser_check(this.A);
					A_count++;
					return;
				}
				else if(A_count==10){
					System.out.println("해당 타입 좌석이 모두 예약되어 있습니다. 다른 좌석을 선택해주세요.");
				}
			}
			else if(num == 3){
				if(B_count!=10) {
					System.out.print("B = ");
					reser_check(this.B);
					B_count++;
					return;
				}
				else if(B_count==10){
					System.out.println("해당 타입 좌석이 모두 예약되어 있습니다. 다른 좌석을 선택해주세요.");
				}
			}
			else {  // 없는 좌석 선택 시 안내문 출력 후 다시 처음으로 
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}	
	}
	public void reser_check(String Seat[]){ //예약 선택 시 조건이 충족되면 호출
		for(int i=0;i<10;i++)//예약된 자리 출력
			System.out.print(Seat[i]+" ");
		System.out.println();
		
		System.out.print("이름 >> ");  //이름 번호 입력
		String name = scanner.next();
		while(true) {
			System.out.print("번호 >> ");  
			int seat_num = scanner.nextInt();
			if(Seat[seat_num-1].equals("___")) { // 선택한 좌석이 이미 예약이 되어 있는 경우 다시 좌석 선택
				Seat[seat_num-1]=name;
				return;
			}
			else
				System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
		}
	}
	public void seat_check(String Seat[]) {  // 예약된 좌석 한줄 씩 출력해주는 함수
		for(int i=0;i<10;i++)
			System.out.print(Seat[i]+" ");
		System.out.println();
	}
	public void check() {  // 조회해주는 함수
		System.out.print("S>> ");
		seat_check(S);
		
		System.out.print("A>> ");
		seat_check(A);
		
		System.out.print("B>> ");
		seat_check(B);
		
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	public void cancle() {  // 취소해주는 함수
		while(true) {
			System.out.print("좌석 S:1, A:2, B:3 >> ");
			int num = scanner.nextInt();
			if(num==1) {
				if(S_count!=0) {  //선택된 타입의 좌석이 모두 비어있다면 다른 타입 좌석 선택하도록 함
					System.out.print("S = ");
					seat_check(S);
					cancle_check(S);
					S_count--;  // 무사히 최소하였다면 예약된 자리의 수 감소 
					return;
				}
				else if(S_count==0){
					System.out.println("해당 타입 좌석이 모두 비어있습니다. 다른 타입 좌석을 선택해주세요.");
				}
			}
			else if(num == 2){
				if(A_count!=0) {
					System.out.print("A = ");
					seat_check(A);
					cancle_check(A);
					A_count--;
					return;
				}
				else if(A_count==0){
					System.out.println("해당 타입 좌석이 모두 비어있습니다. 다른 타입 좌석을 선택해주세요.");
				}
			}
			else if(num == 3){
				if(B_count!=0) {
					System.out.print("B = ");
					seat_check(B);
					cancle_check(B);
					B_count--;
					return;
				}
				else if(B_count==0){
					System.out.println("해당 타입 좌석이 모두 비어있습니다. 다른 타입 좌석을 선택해주세요.");
				}
			}
			else {  //좌석의 타입 번호를 잘못 선택했을 경우 다시 선택
				System.out.println("좌석을 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	public void cancle_check(String Seat[]) {  // 예매된 자리를 취소해주는 함수
		while(true) {
			System.out.print("이름>> ");
			String name=scanner.next();
			int count=0;
			for(int i=0;i<10;i++) {
				if(Seat[i].equals(name)){  //같은 이름이 있다면 해당 자리를 빈 자리로 표시해준 후 카운트 변경
					Seat[i]="___";
					count =1;
					break;
				}
			}
			if(count!=0)  // 자리를 변경하였다면 함수 빠져 나가고 아니라면 다시 처음으로 돌아가 입력받음
				return;
			else {
				System.out.println("입력한 이름이 존재하지 않습니다. 다시 입력해주세요.");
			}
		}
	}
}

public class Concert {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Sys concert= new Sys();
		while(true) {
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				concert.reservation();
				break;
			case 2:
				concert.check();
				break;
			case 3:
				concert.cancle();
				break;
			case 4:
				System.out.println("프로그램을 종료하겠습니다.");
				sc.close();
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
		}
	}

}
