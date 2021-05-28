package week4;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("sum of the argument: ");
		int sum = 0;//args 배열 1번째index값 부터의 합을 저장할 변수 
		int a = 0;//args 배열에 1번째 부터 int형으로 바꾼후 임시로저장할 변수
		int size = Integer.parseInt(args[0]);//처음 args값이 입력받을 숫자 개수
		
		for(int i = 0; i < size; i++) {
			a = Integer.parseInt(args[i+1]);
			sum += a;
		}
		System.out.print(sum);
	}

}
