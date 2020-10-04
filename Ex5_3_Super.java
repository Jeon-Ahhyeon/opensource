package example;

class Point5_3{
	private int x,y;
	public Point5_3() {
		this.x=this.y=0;
	}
	public Point5_3(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+" , "+y+")");
	}
}

class ColorPoint5_3 extends Point5_3{
	private String color;
	public ColorPoint5_3(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class Ex5_3_Super {
	public static void main(String [] args) {
		ColorPoint5_3 cp = new ColorPoint5_3(5,6,"blue");
		cp.showColorPoint();
	}

}
