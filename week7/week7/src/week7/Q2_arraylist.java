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
		/*����η� ������ �о� �Խ��ϴ�.*/
		String path = Q2_arraylist.class.getResource("").getPath();
		FileInputStream file = new FileInputStream(path+"fruits.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(file));
		/*Line�� �������� �о���� s�� delimiter*/
		String s;
		String delimiter=",";
		/*ArrayList�� Object type���� �����ϰ� file���� ���� �о�� ���� �̸��� ������ �����Ѵ�*/
		ArrayList<Fruits> fruit = new ArrayList<Fruits>();
		while((s=reader.readLine()) != null) {
			String[] seperate = s.split(delimiter);
			fruit.add(new Fruits(seperate[0], Integer.parseInt(seperate[1].trim())));
		}
		/*�ݺ��� ����*/
		System.out.println("�����Ϸ��� \"exit\"�� �Է��ϼ���");
		while(true) {
			Iterator<Fruits> it = fruit.iterator();
			boolean check = false;//������ �ִ��� check
			System.out.print("���� �̸��� �Է��ϼ��� : ");
			String input = sc.nextLine();
			/*���� ����*/
			if(input.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			/*���� �ڷᰡ ������ ���� arraylist�� �˻��� ������ �ִ��� Ȯ��*/
			while(it.hasNext()) {
				Fruits f = it.next();
				if(f.getName().equals(input)) {
					System.out.println("������ " + f.getNum() + "�� �ֽ��ϴ�.");
					check = true;
					break;
				}
			}
			/*�˻��� ������ ���� �� ���*/
			if(check == false) System.out.println("������ �����ϴ�.");
		}
		
		
		file.close();
		sc.close();
		}catch(IOException e){
			System.err.println(e);

			  System.exit(1);
		}
	}

}
