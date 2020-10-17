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
		information.add(new Nation("그리스","아테네"));
		information.add(new Nation("독일","베를린"));
		information.add(new Nation("멕시코","멕시코시티"));
		information.add(new Nation("영국","런던"));
		information.add(new Nation("중국","베이징"));
	}
	
	private void input() {
		int i = information.size();
		int check =0;
		System.out.println("현재 "+i+"개의 나라와 수도가 입력되어 있습니다.");
		
		while(true) {
			
			System.out.print("나라와 수도 입력 "+(i+1) +" >> ");
			String country = sc.next();
			if(country.equals("그만")) break;
			String capital = sc.next();
			check=0;
			for(int k=0;k<information.size();k++) {
				if(information.get(k).getCountry().equals(country)) {
					check = 100;
					break;
				}
			}
			if(check==100) {
				System.out.println(country+"는 이미 있습니다!");
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
			System.out.print(right.getCountry()+"의 수도는? ");
			String user = sc.next();
			if(user.equals("그만")) break;
			if(user.equals(right.getCapital())) System.out.println("정답!!");
			else System.out.println("아닙니다!!");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ex7_Capital game= new Ex7_Capital();
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
