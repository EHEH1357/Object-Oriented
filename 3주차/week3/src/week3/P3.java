package week3;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("����,����,�� �� �ϳ��� �Է��ϼ��� : ");
		String in = sc.nextLine();
		
		//switch������ ����, ����, ���϶� 1, 2, 3 ���
		switch(in){
			case "����":
				System.out.println(1);
				break;
			case "����":
				System.out.println(2);
				break;
			case "��":
				System.out.println(3);
				break;
			default:
				System.out.println(0);
				break;
		}
		
		sc.close();
	}

}
