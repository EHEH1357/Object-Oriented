package week4;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("sum of the argument: ");
		int sum = 0;//args �迭 1��°index�� ������ ���� ������ ���� 
		int a = 0;//args �迭�� 1��° ���� int������ �ٲ��� �ӽ÷������� ����
		int size = Integer.parseInt(args[0]);//ó�� args���� �Է¹��� ���� ����
		
		for(int i = 0; i < size; i++) {
			a = Integer.parseInt(args[i+1]);
			sum += a;
		}
		System.out.print(sum);
	}

}
