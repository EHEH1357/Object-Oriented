package television;

public class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color){
		super(size);
		this.color = color;
	}//ũ��� �� ����
	public void printProperty() {
		System.out.println(getSize() + " ��ġ " + this.color + " �÷�");
	}//���
}
