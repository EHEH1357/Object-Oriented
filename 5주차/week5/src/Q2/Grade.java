package Q2;

public class Grade {
	private int math;
	private int science;
	private int english;
	private double avg;
	//private���� math, science, english, avg������ �������ݴϴ�.
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}//�����ڷ� math, science, english �޽��ϴ�
	
	public int getmath() {
		return this.math;
	}//math getter 
	
	public int getscience() {
		return this.science;
	}//science getter
	public int getenglish() {
		return this.english;
	}//english getter
	
	public double average() {
		this.avg = (double)this.math + (double)this.english + (double)this.science;
		return this.avg = avg/3;
	}//��հ� ��ȯ
}
