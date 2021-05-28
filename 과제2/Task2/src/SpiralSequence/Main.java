package SpiralSequence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*	n - Spiral Sequence의 ROW를 입력 및 저장
		 *	m - Spiral Sequence의 COL을 입력 및 저장  */
		System.out.println("===================== Spiral Sequence =====================");
		System.out.print("Spiral Sequence {N}입력 : ");
		int n = sc.nextInt();
		System.out.print("Spiral Sequence {M}입력 : ");
		int m = sc.nextInt();
		System.out.println("Spiral Sequence {"+n+"}*{"+m+"} Matrix Print : ");
		/*	class SpiralFill을 호출후 FillnPrint에 n, m 값을 넘겨주어
		 *  N*M의 Spiral Sequence생성 및 출력*/
		SpiralFill spiralfill = new SpiralFill();
		spiralfill.FillnPrint(n, m);
		
		sc.close();
	}

}
