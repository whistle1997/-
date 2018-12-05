package TwoLianXi4;

public class Test {

	public static void main(String[] args) {
		Printer b = new BlackPrinter("ºÚ°×");
		Printer c = new ColorPrinter("²ÊÉ«");
		b.print();
		c.print();
		Employee e = new Employee();
		e.makeBook(b);
		e.makeBook(c);
	}

}
