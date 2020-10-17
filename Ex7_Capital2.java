package project_7;
import java.util.*;


public class Ex7_Capital2 {
	private HashMap<String,String>information = new HashMap<String,String>();
	private Scanner sc = new Scanner(System.in);
	
	public Ex7_Capital2() {
		information.put("그리스","아테네");
		information.put("독일","베를린");
		information.put("멕시코","멕시코시티");
		information.put("영국","런던");
		information.put("중국","베이징");
	}
	
	private void input() {
		int i=information.size();
		System.out.println("현재 "+i+"개 나라와 수도가 입력되어 있습니다.");
		while(true) {
			
			System.out.print("나라와 수도 입력 "+(i+1) +" >> ");
			String country = sc.next();
			if(country.equals("그만")) break;
			String capital = sc.next();
			if(information.containsKey(country)) {
				System.out.println(country+"는 이미 있습니다!");
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
			System.out.print((String)array[index]+"의 수도는?");
			String user = sc.next();
			if(user.equals("그만")) break;
			if(user.equals(information.get((String)array[index])))
				System.out.println("정답!!");
			else System.out.println("아닙니다!!");
		}
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Ex7_Capital2 game= new Ex7_Capital2();
		System.out.println("****수도 맞추기 게임을 시작합니다. ****");
		
		while(true) {
			System.out.print("입력 : 1, 퀴즈 : 2, 종료 : 3 >> ");
			int num = scanner.nextInt();
			switch(num) {
			case 1:
				game.input(); break;
			case 2: 
				game.quiz(); break;
			case 3: 
				System.out.println("게임을 종료합니다.");
				return;
			default: 
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

}
