package week7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			/*����η� ������ �о� �Խ��ϴ�.*/
			String path = Q1.class.getResource("").getPath();
			FileInputStream file = new FileInputStream(path+"fruits.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(file));

			String s;
			String delimiter = ",";
			/*�ٸ��� �о�� ������ delimiter�� ���� �����̸��� ������ ����� �ݴϴ�.*/
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
