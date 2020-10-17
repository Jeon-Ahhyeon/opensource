package project_7;
import java.util.*;


public class Ex7_Capital2 {
	private HashMap<String,String>information = new HashMap<String,String>();
	private Scanner sc = new Scanner(System.in);
	
	public Ex7_Capital2() {
		information.put("�׸���","���׳�");
		information.put("����","������");
		information.put("�߽���","�߽��ڽ�Ƽ");
		information.put("����","����");
		information.put("�߱�","����¡");
	}
	
	private void input() {
		int i=information.size();
		System.out.println("���� "+i+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			
			System.out.print("����� ���� �Է� "+(i+1) +" >> ");
			String country = sc.next();
			if(country.equals("�׸�")) break;
			String capital = sc.next();
			if(information.containsKey(country)) {
				System.out.println(country+"�� �̹� �ֽ��ϴ�!");
				continue;
			}
			else {
				information.put(country,capital);
				++i;
			}
		}
		
	}
	private void quiz() {
		Set<String>keys=information.keySet();
		Object [] array = (keys.toArray());
		while(true) {
			int index = (int)(Math.random()*information.size());
			System.out.print((String)array[index]+"�� ������?");
			String user = sc.next();
			if(user.equals("�׸�")) break;
			if(user.equals(information.get((String)array[index])))
				System.out.println("����!!");
			else System.out.println("�ƴմϴ�!!");
		}
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Ex7_Capital2 game= new Ex7_Capital2();
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
