package SpiralSequence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*	n - Spiral Sequence�� ROW�� �Է� �� ����
		 *	m - Spiral Sequence�� COL�� �Է� �� ����  */
		System.out.println("===================== Spiral Sequence =====================");
		System.out.print("Spiral Sequence {N}�Է� : ");
		int n = sc.nextInt();
		System.out.print("Spiral Sequence {M}�Է� : ");
		int m = sc.nextInt();
		System.out.println("Spiral Sequence {"+n+"}*{"+m+"} Matrix Print : ");
		/*	class SpiralFill�� ȣ���� FillnPrint�� n, m ���� �Ѱ��־�
		 *  N*M�� Spiral Sequence���� �� ���*/
		SpiralFill spiralfill = new SpiralFill();
		spiralfill.FillnPrint(n, m);
		
		sc.close();
	}

}
