package LianXi1;

public class Square {
	private int chang ;
	private int kuan ;
	private int l ;
	private int s ;
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
	public int ZhouChang(){
		l = (chang + kuan)*2;
		return l;
	}
	public int MianJi(){
		s = chang * kuan ;
		return s;
	}
}
