package SanJiaoXing;

public class SanJIaoXing {
	private int b1 ;
	private int b2 ;
	private int b3 ;
	private int Slong ;
	public SanJIaoXing(int b1, int b2, int b3) {
		super();
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
	}
	
	public int getB1() {
		return b1;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public int getB2() {
		return b2;
	}

	public void setB2(int b2) {
		this.b2 = b2;
	}

	public int getB3() {
		return b3;
	}

	public void setB3(int b3) {
		this.b3 = b3;
	}

	public int getSlong() {
		return Slong;
	}

	public void setSlong(int slong) {
		Slong = slong;
	}

	public int Slong(){
		Slong = b1 + b2 + b3 ;
		return Slong;
	}
}
