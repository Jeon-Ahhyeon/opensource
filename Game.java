package project_3;
import java.util.Scanner;

public class Game {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String rand[] = {"����","����","��"};
		String user;
		System.out.println("����ڿ� ���� ���� �� ������ �մϴ�.");
		
		do {
			System.out.print("���� ���� ��! >> ");
			user = scanner.next();
			
			int num = (int)(Math.random()*3);
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else if(user.equals("����")) {
				switch(rand[num]) {
				case("����"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , �����ϴ�.");
					break;
				case("����"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , ��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case("��"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , ����ڰ� �̰���ϴ�.");
					break;
				}
			}
			else if(user.equals("����")) {
				switch(rand[num]) {
				case("����"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , ����ڰ� �̰���ϴ�.");
					break;
				case("����"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , �����ϴ�.");
					break;
				case("��"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , ��ǻ�Ͱ� �̰���ϴ�.");
					break;
				}
			}
			else if(user.equals("��")) {
				switch(rand[num]) {
				case("����"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , ��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case("����"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , ����ڰ� �̰���ϴ�.");
					break;
				case("��"):
					System.out.println("����� = "+user+" , ��ǻ�� = "+rand[num]+" , �����ϴ�.");
					break;
				}
			}
			else 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				
		}while(true);
		scanner.close();
	}

}
