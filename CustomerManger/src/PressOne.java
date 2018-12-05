import java.util.Scanner;

public class PressOne {
	Scanner in = new Scanner(System.in);
	AddCustomer add = new AddCustomer();
	Customer c ;
	public Customer One(){
		System.out.print("\t\t输入id：");
		int id = in.nextInt();
		System.out.print("\t\t输入姓名：");
		String name = in.next();
		System.out.print("\t\t输入年龄：");
		int age = in.nextInt();
		System.out.print("\t\t输入性别：");
		String sex = in.next();
		System.out.println("\t\t是否称为VIP？ Y/N:");
		String s = in.next() ;
		if(s.equals("Y")){
			System.out.print("\t\t选择您要成为的VIP类型，黄金/白金");
			String v = in.next();
			c = new VIP(id , name, age, sex, v);
		}else{
			c = new Customer(id , name , age ,sex);
		}
		return c ;
	}
}
