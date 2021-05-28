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
			/*����η� ������ �о� �Խ��ϴ�.*/
			String path = Q2_arraylist.class.getResource("").getPath();
			FileInputStream file = new FileInputStream(path+"fruits.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(file));
			/*Line�� �������� �о���� s�� delimiter*/
			String s;
			String delimiter=",";
			/*hashmap�� file���� ���� �о�� ���� ���� �̸��� ������ ���� ��ŵ�ϴ�.*/
			HashMap<String, Integer> fruit = new HashMap<>();
			while((s=reader.readLine()) != null) {
				String[] seperate = s.split(delimiter);
				
				fruit.put(seperate[0], Integer.parseInt(seperate[1].trim()));
			}
			/*�ݺ��� ����*/
			System.out.println("�����Ϸ��� \"exit\"�� �Է��ϼ���");
			for(;;) {
				System.out.print("���� �̸��� �Է��ϼ��� : ");
				String input = sc.nextLine();
				if(input.equals("exit")) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				/*containKey ��ɾ�� hashMap�� �˻��ϰ��� �ϴ� ������ �ִ��� Ȯ��*/
				if(fruit.containsKey(input))
					System.out.println("������ " + fruit.get(input) + "�� �ֽ��ϴ�,");
				else
					System.out.println("������ �����ϴ�.");
			}
			
			sc.close();
			file.close();
		}catch (IOException e){
			System.err.println(e);

			  System.exit(1);
		}
	}

}
