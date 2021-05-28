package Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				
				System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
				int math = sc.nextInt();
				int science = sc.nextInt();
				int english = sc.nextInt();
				Grade me = new Grade(math, science, english);
				System.out.println("평균은 "+me.average());
				break;
			}catch(InputMismatchException e){
				System.out.println("ERROR : You must enter an integer");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
