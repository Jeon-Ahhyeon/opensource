package example;

class Person5_4{}
class Student5_4 extends Person5_4{}
class Researcher extends Person5_4{}
class Professor extends Researcher{}

public class Ex5_4_InstanceOf {
	static void print(Person5_4 p) {
		if(p instanceof Person5_4)
			System.out.print("Person ");
		if(p instanceof Student5_4)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[]args) {
		System.out.print("new Student() -> \t"); print(new Student5_4());
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		System.out.print("new Professor() -> \t"); print(new Professor());
	}

}
