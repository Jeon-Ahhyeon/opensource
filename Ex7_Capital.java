package project_7;
import java.util.Scanner;
import java.util.Vector;

class Nation{
	private String country;
	private String capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {
		return this.country;
	}
	public String getCapital() {
		return this.capital;
	}
}
public class Ex7_Capital {
	private Vector<Nation>information = new Vector<Nation>();
	private Scanner sc = new Scanner(System.in);
	public Ex7_Capital() {
		information.add(new Nation("�׸���","���׳�"));
		information.add(new Nation("����","������"));
		information.add(new Nation("�߽���","�߽��ڽ�Ƽ"));
		information.add(new Nation("����","����"));
		information.add(new Nation("�߱�","����¡"));
	}
	
	private void input() {
		int i = information.size();
		int check =0;
		System.out.println("���� "+i+"���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		
		while(true) {
			
			System.out.print("����� ���� �Է� "+(i+1) +" >> ");
			String country = sc.next();
			if(country.equals("�׸�")) break;
			String capital = sc.next();
			check=0;
			for(int k=0;k<information.size();k++) {
				if(information.get(k).getCountry().equals(country)) {
					check = 100;
					break;
				}
			}
			if(check==100) {
				System.out.println(country+"�� �̹� �ֽ��ϴ�!");
				continue;
			}
			else {
				information.add(new Nation(country,capital));
				++i;
			}
		}
	}
	private void quiz() {
		while(true) {
			int index = (int)(Math.random()*information.size());
			Nation right = information.get(index);
			System.out.print(right.getCountry()+"�� ������? ");
			String user = sc.next();
			if(user.equals("�׸�")) break;
			if(user.equals(right.getCapital())) System.out.println("����!!");
			else System.out.println("�ƴմϴ�!!");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ex7_Capital game= new Ex7_Capital();
		System.out.println("****���� ���߱� ������ �����մϴ�. ****");
		
		while(true) {
			System.out.print("�Է� : 1, ���� : 2, ���� : 3 >> ");
			int num = scanner.nextInt();
			switch(num) {
			case 1:
				game.input(); break;
			case 2: 
				game.quiz(); break;
			case 3: 
				System.out.println("������ �����մϴ�.");
				return;
			default: 
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}

}
