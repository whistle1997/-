package TwoLianXi3;

public class BlackPrinter extends Printer{
	private String color;
	public BlackPrinter(String color){
		this.color = color ;
	}
	void print(){
		System.out.println("打印机打出来的是"+color+"的");
	}
}
