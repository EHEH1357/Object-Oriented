package week7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Q2_hashmap {

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
			/*hashmap에 file으로 부터 읽어온 값을 과일 이름과 개수로 저장 시킵니다.*/
			HashMap<String, Integer> fruit = new HashMap<>();
			while((s=reader.readLine()) != null) {
				String[] seperate = s.split(delimiter);
				
				fruit.put(seperate[0], Integer.parseInt(seperate[1].trim()));
			}
			/*반복문 실행*/
			System.out.println("종료하려면 \"exit\"를 입력하세요");
			for(;;) {
				System.out.print("과일 이름을 입력하세요 : ");
				String input = sc.nextLine();
				if(input.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				/*containKey 명령어로 hashMap에 검색하고자 하는 과일이 있는지 확인*/
				if(fruit.containsKey(input))
					System.out.println("과일이 " + fruit.get(input) + "개 있습니다,");
				else
					System.out.println("과일이 없습니다.");
			}
			
			sc.close();
			file.close();
		}catch (IOException e){
			System.err.println(e);

			  System.exit(1);
		}
	}

}
