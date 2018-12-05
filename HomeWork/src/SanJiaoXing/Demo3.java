package SanJiaoXing;
//创建一个三角形类，成员变量三边，方法求周长，创建类主类A来测试它。
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanJIaoXing s = new SanJIaoXing(3, 4, 5);
		int Slong = s.Slong();
		System.out.println("三角形周长为："+Slong);
	}

}
