package LianXi;
//5�����һ���������࣬��Ա�����������Ϳ������м���������ܳ��ķ�����������Ӧ��set������get�������úͻ�ó��Ϳ���д����������Ƿ�ﵽԤ�����ܡ�
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
