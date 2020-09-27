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
			System.out.print("�¼����� S(1), A(2), B(3) >> ");
			int num = scanner.nextInt();
			if(num==1) {
				if(S_count!=10) {  //�¼��� �� ������ ���� ���� ��� �ش� Ÿ�� �¼��� ������ ����
					System.out.print("S = ");
					reser_check(this.S);
					S_count++;  //����� �¼��� ���� �ϳ� ����
					return;
				}
				else if(S_count==10){  //�¼��� �� �� ��� �ٸ� �¼� ������ �� �ֵ��� ��
					System.out.println("�ش� Ÿ�� �¼��� ��� ����Ǿ� �ֽ��ϴ�. �ٸ� �¼��� �������ּ���.");
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
					System.out.println("�ش� Ÿ�� �¼��� ��� ����Ǿ� �ֽ��ϴ�. �ٸ� �¼��� �������ּ���.");
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
					System.out.println("�ش� Ÿ�� �¼��� ��� ����Ǿ� �ֽ��ϴ�. �ٸ� �¼��� �������ּ���.");
				}
			}
			else {  // ���� �¼� ���� �� �ȳ��� ��� �� �ٽ� ó������ 
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}	
	}
	public void reser_check(String Seat[]){ //���� ���� �� ������ �����Ǹ� ȣ��
		for(int i=0;i<10;i++)//����� �ڸ� ���
			System.out.print(Seat[i]+" ");
		System.out.println();
		
		System.out.print("�̸� >> ");  //�̸� ��ȣ �Է�
		String name = scanner.next();
		while(true) {
			System.out.print("��ȣ >> ");  
			int seat_num = scanner.nextInt();
			if(Seat[seat_num-1].equals("___")) { // ������ �¼��� �̹� ������ �Ǿ� �ִ� ��� �ٽ� �¼� ����
				Seat[seat_num-1]=name;
				return;
			}
			else
				System.out.println("�̹� ����� �¼��Դϴ�. �ٸ� �¼��� �������ּ���.");
		}
	}
	public void seat_check(String Seat[]) {  // ����� �¼� ���� �� ������ִ� �Լ�
		for(int i=0;i<10;i++)
			System.out.print(Seat[i]+" ");
		System.out.println();
	}
	public void check() {  // ��ȸ���ִ� �Լ�
		System.out.print("S>> ");
		seat_check(S);
		
		System.out.print("A>> ");
		seat_check(A);
		
		System.out.print("B>> ");
		seat_check(B);
		
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	public void cancle() {  // ������ִ� �Լ�
		while(true) {
			System.out.print("�¼� S:1, A:2, B:3 >> ");
			int num = scanner.nextInt();
			if(num==1) {
				if(S_count!=0) {  //���õ� Ÿ���� �¼��� ��� ����ִٸ� �ٸ� Ÿ�� �¼� �����ϵ��� ��
					System.out.print("S = ");
					seat_check(S);
					cancle_check(S);
					S_count--;  // ������ �ּ��Ͽ��ٸ� ����� �ڸ��� �� ���� 
					return;
				}
				else if(S_count==0){
					System.out.println("�ش� Ÿ�� �¼��� ��� ����ֽ��ϴ�. �ٸ� Ÿ�� �¼��� �������ּ���.");
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
					System.out.println("�ش� Ÿ�� �¼��� ��� ����ֽ��ϴ�. �ٸ� Ÿ�� �¼��� �������ּ���.");
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
					System.out.println("�ش� Ÿ�� �¼��� ��� ����ֽ��ϴ�. �ٸ� Ÿ�� �¼��� �������ּ���.");
				}
			}
			else {  //�¼��� Ÿ�� ��ȣ�� �߸� �������� ��� �ٽ� ����
				System.out.println("�¼��� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
	}
	public void cancle_check(String Seat[]) {  // ���ŵ� �ڸ��� ������ִ� �Լ�
		while(true) {
			System.out.print("�̸�>> ");
			String name=scanner.next();
			int count=0;
			for(int i=0;i<10;i++) {
				if(Seat[i].equals(name)){  //���� �̸��� �ִٸ� �ش� �ڸ��� �� �ڸ��� ǥ������ �� ī��Ʈ ����
					Seat[i]="___";
					count =1;
					break;
				}
			}
			if(count!=0)  // �ڸ��� �����Ͽ��ٸ� �Լ� ���� ������ �ƴ϶�� �ٽ� ó������ ���ư� �Է¹���
				return;
			else {
				System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
}

public class Concert {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Sys concert= new Sys();
		while(true) {
			System.out.print("���� : 1, ��ȸ : 2, ��� : 3, ������ : 4 >> ");
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
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				sc.close();
				return;
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
			
		}
	}

}
