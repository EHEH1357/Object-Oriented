package q2;

public class Rect implements Shape{
	private int p1, p2;
	public Rect(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	//draw �������̵�
	public void draw() {
		System.out.println(this.p1 + "x" + this.p2 + "ũ���� �簢���Դϴ�.");
	}//getArea �������̵�
	public double getArea() {
		return this.p1 * this.p2;
	}
}
