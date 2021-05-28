package q2;

public class Circle implements Shape{
	private int r;
	public Circle(int r){
		this.r = r;
	}
	//getArea 오버라이딩
	public double getArea() {
		return r * r * PI;
	}
	//draw 오버라이딩
	public void draw() {
		System.out.println("반지름이 " + this.r + "인 원입니다.");
	}
}
