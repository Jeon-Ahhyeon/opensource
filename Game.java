package project_3;
import java.util.Scanner;

public class Game {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String rand[] = {"가위","바위","보"};
		String user;
		System.out.println("사용자와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.print("가위 바위 보! >> ");
			user = scanner.next();
			
			int num = (int)(Math.random()*3);
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else if(user.equals("가위")) {
				switch(rand[num]) {
				case("가위"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 비겼습니다.");
					break;
				case("바위"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 컴퓨터가 이겼습니다.");
					break;
				case("보"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 사용자가 이겼습니다.");
					break;
				}
			}
			else if(user.equals("바위")) {
				switch(rand[num]) {
				case("가위"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 사용자가 이겼습니다.");
					break;
				case("바위"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 비겼습니다.");
					break;
				case("보"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 컴퓨터가 이겼습니다.");
					break;
				}
			}
			else if(user.equals("보")) {
				switch(rand[num]) {
				case("가위"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 컴퓨터가 이겼습니다.");
					break;
				case("바위"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 사용자가 이겼습니다.");
					break;
				case("보"):
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+rand[num]+" , 비겼습니다.");
					break;
				}
			}
			else 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
		}while(true);
		scanner.close();
	}

}
