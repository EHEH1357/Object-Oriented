package week3;

public class P4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][] = {{1, 2, 3}, {2, 5, 3}, {1, 0, 8}};
		double b[][] = {{1, -2, 4}, {-5, 2, 0}, {1, 0, 3}};
		double unit[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
		double[][] c = new double[a.length][b[0].length];
		double[][] tmp = new double[a.length][b[0].length];
		//행렬의 곱
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				c[i][j] = 0;
				for(int k = 0; k < a[0].length; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		//행렬의 곱 출력
		System.out.println("A x B : ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.printf("%10f ", c[i][j]);
				if(j == b[0].length-1) {
					System.out.println();
				}
			}
		}
		//a행렬의 값을 변수에 저장
		double ind1 = a[0][0]; double ind2 = a[0][1]; double ind3 = a[0][2];
		double ind4 = a[1][0]; double ind5 = a[1][1]; double ind6 = a[1][2];
		double ind7 = a[2][0]; double ind8 = a[2][1]; double ind9 = a[2][2];
		//판별식 값 구하기
		double result = 0;
		result = ind1*ind5*ind9 - ind1*ind6*ind8 - ind2*ind4*ind9 + 
				ind2*ind6*ind7 + ind3*ind4*ind8 - ind3*ind5*ind7;
		//판별식이 0일때 역행렬이 존재하지 않음
		if(result == 0) {
			System.out.println("역행렬이 존재하지 않습니다!");
			System.exit(0);
		}
		//역행렬 값 대입
		tmp[0][0] = (ind5*ind9 - ind6*ind8)/result;
		tmp[0][1] = (ind3*ind8 - ind2*ind9)/result;
		tmp[0][2] = (ind2*ind6 - ind3*ind5)/result;
		tmp[1][0] = (ind6*ind7 - ind4*ind9)/result;
		tmp[1][1] = (ind1*ind9 - ind3*ind7)/result;
		tmp[1][2] = (ind3*ind4 - ind1*ind6)/result;
		tmp[2][0] = (ind4*ind8 - ind5*ind7)/result;
		tmp[2][1] = (ind2*ind7 - ind1*ind8)/result;
		tmp[2][2] = (ind1*ind5 - ind2*ind4)/result;
		//역행렬 값 출력
		System.out.println("A의 역행렬 : ");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++) {
				System.out.printf("%10f ", tmp[i][j]);
				if(j == a[0].length-1) {
					System.out.println();
				}
			}
		}
		//A와 A의 역행렬의 곱
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i][j] = 0;
				for(int k = 0; k < a[0].length; k++)
					c[i][j] += a[i][k] * tmp[k][j];
			}
		}
		//A와 A의 역행렬의 곱 출력
		System.out.println("행렬 A와 A의 역행렬의 곱 : ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.printf("%10f ", c[i][j]);
				if(j == a[0].length-1) {
					System.out.println();
				}
			}
		}
		System.out.print("행렬 A와 A의 역행렬의 곱이 단위행렬과 같은가 : ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(unit[i][j] != c[i][j]) {
					System.out.println("False");
					System.exit(0);
				}
			}
		}
		System.out.println("True");
	}

}
