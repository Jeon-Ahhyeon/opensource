import javax.swing.*;
import java.awt.*;


class Menu extends JPanel{
	public Menu() {
		setBackground(Color.gray);
		setLayout(new FlowLayout());
		
	}
}
class Text extends JPanel{
	public Text() {
		setBackground(Color.white);
		setLayout(null);
	}
}
public class Ex9_Swing extends JFrame{
	public Ex9_Swing() {
		setTitle("스윙 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		Menu m = new Menu();
		m.add(new JButton("OK"));
		m.add(new JButton("READ"));
		m.add(new JButton("CLOSE"));
		contentPane.add(m, BorderLayout.NORTH);
		
		Text t= new Text();
		
		JLabel hello = new JLabel("hello");
		JLabel java = new JLabel("java");
		JLabel Love = new JLabel("Love");
		hello.setBounds(100,20,30,10);
		java.setBounds(50, 150,30,10);
		Love.setBounds(150,100,30,10);
		
		t.add(hello);
		t.add(java);
		t.add(Love);
		
		
		contentPane.add(t,BorderLayout.CENTER);
		
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex9_Swing();
	}

}
