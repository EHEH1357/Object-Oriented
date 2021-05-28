package week7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			/*상대경로로 파일을 읽어 왔습니다.*/
			String path = Q1.class.getResource("").getPath();
			FileInputStream file = new FileInputStream(path+"fruits.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(file));

			String s;
			String delimiter = ",";
			/*줄마다 읽어온 문장을 delimiter를 통해 과일이름과 개수를 출력해 줍니다.*/
			while ((s = reader.readLine()) != null) {
				String[] seperate = s.split(delimiter);	

				for(int i = 0; i < seperate.length; i++) {
					System.out.println(seperate[i]);
				}
			}
  
			file.close();
			} catch (IOException e) {

			  System.err.println(e);

			  System.exit(1);

			}
	}

}
