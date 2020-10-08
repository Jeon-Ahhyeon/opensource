package project_6;
import java.util.Scanner;

class Person{
	public String name;
	public int num1, num2, num3;
	
	public Person(String name){
		this.name=name;
	}
	public void random() {
		num1=(int)(Math.random()*3+1);
		num2=(int)(Math.random()*3+1);
		num3=(int)(Math.random()*3+1);
	}
	public int compare() {
		if(num1==num2&&num2==num3) {
			System.out.println("\t"+num1+"  "+num2+"  "+num3 +"  "+name+"님이 이겼습니다!");
			return 1;
			
		}
		else {
			System.out.println("\t"+num1+"  "+num2+"  "+num3 +"  아쉽군요!");
			return 0;
		}
	}
}

public class Gambling {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("1번째 선수 이름 >> ");
		String name = sc.next();
		Person person1 = new Person(name);
		
		System.out.print("2번째 선수 이름 >> ");
		name = sc.next();
		Person person2 = new Person(name);
		while(true) {
			System.out.println("["+person1.name+"]"+ " : <Enter>");
			person1.random();
			num = person1.compare();
			if(num==1)
				break;
			
			System.out.println("["+person2.name+"]"+ " : <Enter>");
			person2.random();
			num = person2.compare();
			if(num==1)
				break;
		}
		
	}

}
