package example;

class Point5_1{
	private int x,y;
	public void set(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+" , "+y+")");
	}
}
class ColorPoint5_1 extends Point5_1{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class Ex5_1 {
	public static void main(String [] args) {
		Point5_1 p = new Point5_1();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint5_1 cp = new ColorPoint5_1();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
