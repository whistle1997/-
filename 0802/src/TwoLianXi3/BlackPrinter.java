package TwoLianXi3;

public class BlackPrinter extends Printer{
	private String color;
	public BlackPrinter(String color){
		this.color = color ;
	}
	void print(){
		System.out.println("��ӡ�����������"+color+"��");
	}
}
