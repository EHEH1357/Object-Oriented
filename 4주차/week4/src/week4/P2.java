package week4;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = 97;//a�� ascii code
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�: ");
		char alph = sc.next().charAt(0);
		
		for(int i = 0; i <= (int)alph-97; i++) {
			for(int j = k; j <= (int)alph; j++) {
				System.out.print((char)j+" ");
				if(j==(int)alph) {
					System.out.println();
					k++;//�Է¹��� ���ĺ����� ����� �Ǿ����� a���� ���ĺ����� �Է¹��� ���ĺ����� ���
				}
			}
		}
	}

}
