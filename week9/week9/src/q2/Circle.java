package q2;

public class Circle implements Shape{
	private int r;
	public Circle(int r){
		this.r = r;
	}
	//getArea �������̵�
	public double getArea() {
		return r * r * PI;
	}
	//draw �������̵�
	public void draw() {
		System.out.println("�������� " + this.r + "�� ���Դϴ�.");
	}
}
