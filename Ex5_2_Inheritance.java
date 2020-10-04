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
		name = "ȫ�浿";
		height = 175;
		setWeight(99); // private ��������� weight�� setWeight ����Լ��� ���� ���� ���ٰ���
	}
}

public class Ex5_2_Inheritance {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		
		/*�������� �������� ������ ���Ȯ���� ���� �ۼ�*/
		System.out.println("age : "+s.age);
		System.out.println("name : "+s.name);
		System.out.println("height : "+s.height);
		System.out.println("weight : "+s.getWeight()); //private ���������  getWeight ����Լ��� ���� ���� ����
	}

}
