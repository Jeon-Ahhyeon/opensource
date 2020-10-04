package example;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99); // private 멤버변수인 weight는 setWeight 멤버함수를 통해 간접 접근가능
	}
}

public class Ex5_2_Inheritance {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		
		/*예제에는 적혀있지 않지만 결과확인을 위해 작성*/
		System.out.println("age : "+s.age);
		System.out.println("name : "+s.name);
		System.out.println("height : "+s.height);
		System.out.println("weight : "+s.getWeight()); //private 멤버변수인  getWeight 멤버함수를 통해 간접 접근
	}

}
