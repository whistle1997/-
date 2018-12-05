package DuoTai;
/*
 * 目前问题：
 * 	1、动物类run方法描述不正确
 * 	2、没有强制通知子类一定要重写run方法
 * 
 *   应用场景：我们在描述一类事物的时候，发现该种事物确实存在某种行为，但不具体
 * 			那么我们可以抽取这种行为的声明，但不去实现，称作抽象的行为，使用抽象类解决
 * 抽象类好处：强制要求子类一定要实现指定的方法。
 * 	
 * 抽象类的细节：
 * 		1、如果一个函数没有方法体，那么该函数必须使用abstract修饰，把该函数修饰成抽象的函数
 * 		2、如果一个类出现了抽象的函数，该类也必须用abstact修饰			
 * 		3、如果一个非抽象类继承了抽象类，那么必须把抽象类的所有抽象方法全部实现。
 * 		4、抽象类可以存在非抽象方法，也可以存在抽象方法
 * 		5、抽象类可以不存在抽象方法
 * 		6、抽象类不能创建对象
 * 			问：为什么不能创建对象？
 * 				因为抽象类是存在抽象方法的，如果能让抽象类创建对象的话
 * 				那么抽象的对象调用的抽象方法是没有任何意义的
 * 		7、抽象类是存在构造函数的，其构造函数是提供给子类创建对象的初始化父类的属性的
 * */
abstract class Animal{
	String name ; 
	String color ;
	public Animal(String name , String color){
		this.name = name ;
		this.color = color ;
	}
	public abstract void run();
}

class Dog extends Animal{
	public Dog(String name , String color){
		super(name ,color);
	}
	public void run(){
		System.out.println(name+"用四条腿跑");
	}
}
class Fish extends Animal{
	public Fish(String name , String color){
		super(name ,color);
	}
	public void run(){
		System.out.println(name+"在水里游");
	}
}
public class ChouXiang {
	public static void main(String[] args) {
		Dog d = new Dog("牧羊犬","棕色");
		d.run();
		Fish f = new Fish("锦鲤","金黄色");
		f.run();
	}
}
