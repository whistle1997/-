package LianXi;
//5、设计一个长方形类，成员变量包括长和宽。类中有计算面积和周长的方法，并有相应的set方法和get方法设置和获得长和宽。编写测试类测试是否达到预定功能。
public class ChangFangXing {
	private int chang ;
	private int kuan ;
	private int s ;
	private int z ;
	public int getChang() {
		return chang;
	}
	public void setChang(int chang) {
		this.chang = chang;
	}
	public int getKuan() {
		return kuan;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}
	public int Mian(){
		s= chang * kuan ;
		return s ;
	}
	public int Zhou(){
		z = (chang + kuan)*2 ;
		return z;
	}
}
