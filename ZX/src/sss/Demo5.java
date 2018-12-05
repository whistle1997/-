package sss;
//学习super关键字
//super关键字代表了父类空间的引用
	//作用：
/*
 * 作用：
 * 	1、子父类存在同名成员时，默认在子类中访问子类成员
 * 		可通过super关键字指定访问父类成员
 *  2、创建子类对象时，默认先调用父类无参的构造方法
 *  	可以通过super关键字调用有参的构造方法
 *  super关键字调用父类构造方法注意：
 *  	1、如果在子类的构造方法是没有指定调用父类的构造方法，那么
 *  		java编译器会在子类的构造方法上加上super语句
 *  	2、super关键字调用父类的构造函数时该语句必须是子类构造函数的
 *  		第一个语句
 *  	3、super与this关键字不能同时出现在一个构造函数中
 *  		调用其他的构造函数，因为两个语句都需要第一行执行。
 *  	
 *  	super与this的区别
 *  		1、代表的事物不一致
 *  			super代表父类空间的引用，this代表所属函数的调用者对象
 *  		2、使用前提不一致
 *  			super必须有继承关系才能使用，this不需要继承关系也可使用
 *  		3、调用构造函数的区别
 *  			super调用父类的构造函数，this调用本类的构造函数
 *  
 * */
class Fu{
	int x = 10 ;
	String name ;
	
	public Fu(){
		System.out.println("这是一个父类无参的构造方法");
	}
	public Fu(String name){
		this.name = name ;
		System.out.println("父类带参的构造方法.");
	}
	public void eat(){
		System.out.println("小头爸爸吃番薯");
	}
}
class Zi extends Fu{
	int x = 20 ;
	public Zi(String name ){
		super(name);
	}
	public void print(){
		System.out.println("x="+super.x);
	}
	public void eat(){
		System.out.println("大头儿子吃龙虾");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi("狗娃");
		z.print();//输出子类的x
	}

}
