package Bank;
/*2、编写Java应用程序。
首先定义一个描述银行账户的Account类，包括成员变
量“账号”和“存款余额”，成员方法有“存款”、“取款”和“余额查询”。其次，
编写一个主类，在主类中测试Account类的功能。*/

public class Demo2 {
	public static void main(String[] args) {
		Account a = new Account(110, 10000);
		
		System.out.println("存钱后余额为:"+a.Cun(2000));
		System.out.println("取钱后余额为："+a.Qu(3000));
		System.out.println("一顿猛如虎后余额为："+a.getYuE());
	}
}
