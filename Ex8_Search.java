import java.util.*;
import java.io.*;

class SearchWord extends RuntimeException{
	Scanner sc = new Scanner(System.in);
	Vector<String> line = new Vector<String>();
	public boolean read() {

		while(true) {
			try {
				System.out.print("대상 파일 명 입력>> ");
				String fname=sc.nextLine();
				File fin = new File(fname);
				if(!fin.exists()) {
					System.out.println(fname+"파일이 존재하지 않습니다.");
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
			System.out.print("검색할 단어나 문장>> ");
			String search=sc.nextLine();
			
			if(search.equals("그만")) {
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
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		boolean x = s_w.read();
		if(x==true) {
			s_w.search();
		}
		
		
		System.out.println("프로그램을 종료합니다.");

	}

}
