package q2;

public class Oval implements Shape{
	private int p1, p2;
	public Oval(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	//draw 오버라이딩
	public void draw() {
		System.out.println(this.p1 + "x" + this.p2 + "에 내접하는 타원입니다.");
	}
	//getArea 오버라이딩
	public double getArea() {
		return this.p1 * this.p2 * PI;
	}
}
