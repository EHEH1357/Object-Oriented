package week4;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
				if(j == n[i].length - 1) {
					System.out.println();
				}
			}
		}
	}

}
