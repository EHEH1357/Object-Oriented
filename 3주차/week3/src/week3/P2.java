package week3;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		System.out.print("정수로된 돈의 액수를 입력하세요 : ");
		input = sc.nextInt();
		//금액이 0미만이거나 숫자가 아닐때 종료
		if(input < 0) {
			System.out.print("0이상의 양의 정수를 입력해 주세요!");
			System.exit(0);
		}
		//화폐 단위(default = 0)
		int won1=0, won10=0, won50=0, won100=0, won500=0, won1000=0, won10000=0, won50000=0;
		
		while(input > 0) {
			//5만원권 개수
			if(input >= 50000) {
				won50000 = input/50000;
				input = input-(won50000*50000);
			}
			//1만원권 개수
			else if(input >= 10000 && input < 50000) {
				won10000 = input/10000;
				input = input-(won10000*10000);
			}
			//1천원권 개수
			else if(input >= 1000 && input < 10000) {
				won1000 = input/1000;
				input = input-(won1000*1000);
			}
			//5백원권 개수
			else if(input >= 500 && input < 1000) {
				won500 = input/500;
				input = input-(won500*500);
			}
			//100원권 개수
			else if(input >= 100 && input < 500) {
				won100 = input/100;
				input = input-(won100*100);
			}
			//50원권 개수
			else if(input >= 50 && input < 100) {
				won50 = input/50;
				input = input-(won50*50);
			}
			//10원권 개수
			else if(input >= 10 && input < 50) {
				won10 = input/10;
				input = input-(won10*10);
			}
			//1원권 개수
			else {
				won1 = input/1;
				input = input-(won1*1);
			}
		}
		System.out.println("5만원권 : " + won50000 + "장");
		System.out.println("1만원권 : " + won10000 + "장");
		System.out.println("1천원권 : " + won1000 + "장");
		System.out.println("5백원권 : " + won500 + "장");
		System.out.println("1백원권 : " + won100 + "장");
		System.out.println("5십원권 : " + won50 + "장");
		System.out.println("1십원권 : " + won10 + "장");
		System.out.println("1원권 : " + won1 + "장");
		
		sc.close();
	}

}
