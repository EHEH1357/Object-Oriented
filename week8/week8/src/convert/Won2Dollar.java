package convert;

public class Won2Dollar extends Converter{
	protected double convert(double src) {
		super.ratio = 1200;
		return src/ratio;
	}//�� ��ȯ
	protected String getSrcString() {
		return "��";
	}
	protected String getDestString() {
		return "�޷�";
	}
}
