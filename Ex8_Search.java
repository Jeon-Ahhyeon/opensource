import java.util.*;
import java.io.*;

class SearchWord extends RuntimeException{
	Scanner sc = new Scanner(System.in);
	Vector<String> line = new Vector<String>();
	public boolean read() {

		while(true) {
			try {
				System.out.print("��� ���� �� �Է�>> ");
				String fname=sc.nextLine();
				File fin = new File(fname);
				if(!fin.exists()) {
					System.out.println(fname+"������ �������� �ʽ��ϴ�.");
					return false;
				}
				Scanner filesc = new Scanner(new FileReader(fin));
				
				while(filesc.hasNext()) {
					String temp = filesc.nextLine();
					line.add(temp);
				}
				filesc.close();
				return true;
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
				return false;
			}
				
				
		}
	}
	public void search() {
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String search=sc.nextLine();
			
			if(search.equals("�׸�")) {
				sc.close();
				return;
			}
			for(int i=0;i<line.size();i++) {
				String sentence = line.get(i); 
				if(sentence.indexOf(search)!=-1){
					System.out.println((i+1)+":"+sentence);
				}
			}
		}
	}
}

public class Ex8_Search {
	
	
	public static void main(String []args) {
		SearchWord s_w = new SearchWord();
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		boolean x = s_w.read();
		if(x==true) {
			s_w.search();
		}
		
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
