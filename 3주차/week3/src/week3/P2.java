package week3;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		System.out.print("�����ε� ���� �׼��� �Է��ϼ��� : ");
		input = sc.nextInt();
		//�ݾ��� 0�̸��̰ų� ���ڰ� �ƴҶ� ����
		if(input < 0) {
			System.out.print("0�̻��� ���� ������ �Է��� �ּ���!");
			System.exit(0);
		}
		//ȭ�� ����(default = 0)
		int won1=0, won10=0, won50=0, won100=0, won500=0, won1000=0, won10000=0, won50000=0;
		
		while(input > 0) {
			//5������ ����
			if(input >= 50000) {
				won50000 = input/50000;
				input = input-(won50000*50000);
			}
			//1������ ����
			else if(input >= 10000 && input < 50000) {
				won10000 = input/10000;
				input = input-(won10000*10000);
			}
			//1õ���� ����
			else if(input >= 1000 && input < 10000) {
				won1000 = input/1000;
				input = input-(won1000*1000);
			}
			//5����� ����
			else if(input >= 500 && input < 1000) {
				won500 = input/500;
				input = input-(won500*500);
			}
			//100���� ����
			else if(input >= 100 && input < 500) {
				won100 = input/100;
				input = input-(won100*100);
			}
			//50���� ����
			else if(input >= 50 && input < 100) {
				won50 = input/50;
				input = input-(won50*50);
			}
			//10���� ����
			else if(input >= 10 && input < 50) {
				won10 = input/10;
				input = input-(won10*10);
			}
			//1���� ����
			else {
				won1 = input/1;
				input = input-(won1*1);
			}
		}
		System.out.println("5������ : " + won50000 + "��");
		System.out.println("1������ : " + won10000 + "��");
		System.out.println("1õ���� : " + won1000 + "��");
		System.out.println("5����� : " + won500 + "��");
		System.out.println("1����� : " + won100 + "��");
		System.out.println("5�ʿ��� : " + won50 + "��");
		System.out.println("1�ʿ��� : " + won10 + "��");
		System.out.println("1���� : " + won1 + "��");
		
		sc.close();
	}

}
