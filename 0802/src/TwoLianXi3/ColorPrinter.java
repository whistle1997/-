package TwoLianXi3;

public class ColorPrinter extends Printer{
	private String color;
	public ColorPrinter(String color){
		this.color = color ;
	}
	void print(){
		System.out.println("��ӡ�����������"+color+"��");
	}
}
