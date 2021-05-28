package week4;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = 97;//a의 ascii code
		System.out.print("소문자 알파벳 하나를 입력하시오: ");
		char alph = sc.next().charAt(0);
		
		for(int i = 0; i <= (int)alph-97; i++) {
			for(int j = k; j <= (int)alph; j++) {
				System.out.print((char)j+" ");
				if(j==(int)alph) {
					System.out.println();
					k++;//입력받은 알파벳까지 출력이 되엇으면 a다음 알파벳부터 입력받은 알파벳까지 출력
				}
			}
		}
	}

}
