package Q2;

public class Grade {
	private int math;
	private int science;
	private int english;
	private double avg;
	//private으로 math, science, english, avg변수를 선언해줍니다.
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}//생성자로 math, science, english 받습니다
	
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
	}//평균값 반환
}
