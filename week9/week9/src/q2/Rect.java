package q2;

public class Rect implements Shape{
	private int p1, p2;
	public Rect(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	//draw 오버라이딩
	public void draw() {
		System.out.println(this.p1 + "x" + this.p2 + "크기의 사각형입니다.");
	}//getArea 오버라이딩
	public double getArea() {
		return this.p1 * this.p2;
	}
}
