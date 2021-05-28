package week7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q2_arraylist {
	
	static class Fruits{
		private String name;
		private int num;
		Fruits(String name, int num){
			this.name = name;
			this.num = num;
		}
		
		public String getName() {
			return name;
		}
		public int getNum() {
			return num;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		/*상대경로로 파일을 읽어 왔습니다.*/
		String path = Q2_arraylist.class.getResource("").getPath();
		FileInputStream file = new FileInputStream(path+"fruits.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(file));
		/*Line을 기준으로 읽어들어올 s와 delimiter*/
		String s;
		String delimiter=",";
		/*ArrayList를 Object type으로 삽입하고 file으로 부터 읽어온 과일 이름과 개수를 저장한다*/
		ArrayList<Fruits> fruit = new ArrayList<Fruits>();
		while((s=reader.readLine()) != null) {
			String[] seperate = s.split(delimiter);
			fruit.add(new Fruits(seperate[0], Integer.parseInt(seperate[1].trim())));
		}
		/*반복문 실행*/
		System.out.println("종료하려면 \"exit\"를 입력하세요");
		while(true) {
			Iterator<Fruits> it = fruit.iterator();
			boolean check = false;//과일이 있는지 check
			System.out.print("과일 이름을 입력하세요 : ");
			String input = sc.nextLine();
			/*종료 조건*/
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			/*다음 자료가 있을때 까지 arraylist에 검색한 과일이 있는지 확인*/
			while(it.hasNext()) {
				Fruits f = it.next();
				if(f.getName().equals(input)) {
					System.out.println("과일이 " + f.getNum() + "개 있습니다.");
					check = true;
					break;
				}
			}
			/*검색한 과일이 없을 때 출력*/
			if(check == false) System.out.println("과일이 없습니다.");
		}
		
		
		file.close();
		sc.close();
		}catch(IOException e){
			System.err.println(e);

			  System.exit(1);
		}
	}

}
