package convert;

public class Won2Dollar extends Converter{
	protected double convert(double src) {
		super.ratio = 1200;
		return src/ratio;
	}//돈 변환
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
}
