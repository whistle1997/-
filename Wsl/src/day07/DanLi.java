package day07;

public class DanLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EHan a = EHan.getE();
//		EHan b = EHan.getE();
		LanHan a = LanHan.getL();
		LanHan b = LanHan.getL();
		System.out.println(a == b);
	}

}
//¶öººÊ½
/*class EHan{
	private EHan(){}
	private static EHan e = new EHan();
	public static EHan getE(){
		return e ;
	}
}*/
//ÀÁººÊ½
class LanHan{
	private LanHan(){}
	private static LanHan l = null;
	public static LanHan getL(){
		if(l == null)
			l = new LanHan();
		return l ;
	}
}