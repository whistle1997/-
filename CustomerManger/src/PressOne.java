import java.util.Scanner;

public class PressOne {
	Scanner in = new Scanner(System.in);
	AddCustomer add = new AddCustomer();
	Customer c ;
	public Customer One(){
		System.out.print("\t\t����id��");
		int id = in.nextInt();
		System.out.print("\t\t����������");
		String name = in.next();
		System.out.print("\t\t�������䣺");
		int age = in.nextInt();
		System.out.print("\t\t�����Ա�");
		String sex = in.next();
		System.out.println("\t\t�Ƿ��ΪVIP�� Y/N:");
		String s = in.next() ;
		if(s.equals("Y")){
			System.out.print("\t\tѡ����Ҫ��Ϊ��VIP���ͣ��ƽ�/�׽�");
			String v = in.next();
			c = new VIP(id , name, age, sex, v);
		}else{
			c = new Customer(id , name , age ,sex);
		}
		return c ;
	}
}
