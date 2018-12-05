package JiCheng;

/*
 * 问题：1、无法描述清楚两个类的继承关系
 * 			继承（面向对象第二大特征）
 * 			继承的格式：class 类名1 extends 类名2{
 * 			
 * 			}
 * 			继承是通过关键字extends体现的。
 * 			继承注意事项：
 * 				1、千万不要为了减少重复代码而去继承，只有真正存在
 * 					继承关系，才能继承。
 * 				2、父类私有的成员不能被继承
 * 				3、父类的构造函数不能被继承。
 * 				4、创建子类对象时，默认会先调用父类无参的构造函数
 * 					疑问：为什么要调用父类构造方法？意义：
 * 						调用父类的构造方法是可以初始化从父类继承下去的属性
 * 					调用和继承之间没有关系
 *	    2、存在着重复代码。 
 *			
 * 
 * */
//人类
class Person{//Student的父类（超类、基类）
	String name ;
	private int age; //私人变量，不能继承
	public Person(String name){
		this.name = name ;
	}
	public Person(){
		System.out.println("Person的构造函数被调用了");
	}
	public void eat(){
		System.out.println(name + "在吃饭");
	}
}
//学生类
class Student extends Person {//Student 为Person类子类
	int num ;//学号
	public Student(){
		System.out.println("Student的构造函数被调用了");
	}
	public void study(){
		System.out.println(name+"good good study , day day up");
		
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		/*s.name = "狗娃";
	
		System.out.println("名字:"+s.name);
		s.eat();*/
	}

}
