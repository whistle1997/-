package day08;
class Static {
	
	static int i = getValue();
	static int y = 1 ;
	static{
		System.out.println("¾²Ì¬1");
		
	}
	public static int getValue(){
		System.out.println("y = "+ y);
		return 10 ;
	}
	public void print(){
		System.out.println(i);
		System.out.println(y);
	}
}
public class DaiMaKuai {
	public static void main(String[] args) {
		new Static().print();
		new Static().print();
	}
}
