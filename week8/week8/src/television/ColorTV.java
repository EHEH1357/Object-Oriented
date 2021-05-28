package television;

public class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color){
		super(size);
		this.color = color;
	}//크기와 색 저장
	public void printProperty() {
		System.out.println(getSize() + " 인치 " + this.color + " 컬러");
	}//출력
}
