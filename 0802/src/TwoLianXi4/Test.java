package TwoLianXi4;

public class Test {

	public static void main(String[] args) {
		Printer b = new BlackPrinter("�ڰ�");
		Printer c = new ColorPrinter("��ɫ");
		b.print();
		c.print();
		Employee e = new Employee();
		e.makeBook(b);
		e.makeBook(c);
	}

}
