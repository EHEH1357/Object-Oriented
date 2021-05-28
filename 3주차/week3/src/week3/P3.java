package week3;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가위,바위,보 중 하나를 입력하세요 : ");
		String in = sc.nextLine();
		
		//switch문으로 가위, 바위, 보일때 1, 2, 3 출력
		switch(in){
			case "가위":
				System.out.println(1);
				break;
			case "바위":
				System.out.println(2);
				break;
			case "보":
				System.out.println(3);
				break;
			default:
				System.out.println(0);
				break;
		}
		
		sc.close();
	}

}
