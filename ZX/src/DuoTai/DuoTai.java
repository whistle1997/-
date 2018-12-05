package DuoTai;
/*
 * 多态：一个对象具备多种形态。(父类的引用类型变量或接口的指向了子类的对象)
 * 前提：半继续存在继承或实现关系。
 * 
 * 	动物   a = new  狗();     
 * 
 * 要注意的细节：
 * 	1、多态情况下，子父类存在同名的成员变量时，访问的是父类成员变量（静态和非静态）
 * 	2、多态情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数.
 * 	3、多态情况下，子父类存在同名的静态成员函数时，访问的是父类的成员函数
 * 	4、多态情况下，不能访问子类持有的成员.
 * 总结：多态情况下，子父类存在同名成员时，访问的父类的成员，只有在同名的非静态函数时
 * 		才是访问子类的
 * 
 * 
 * 多态的应用
 * 	1、多态用于形参类型的时候，可以接受更多的数据
 * */
//动物类
abstract class Animal1{
	String name ;
	
	String color = "动物色";
	public Animal1(String name){
		this.name = name ;
	}
	abstract public void run();
}
//老鼠
class Mouse extends Animal1{
	String color = "黑色" ;
	public Mouse(String name){
		super(name) ;
	}
	public void run(){
		System.out.println(name+"四条腿慢慢走");
	}
}


//鱼
class Fish1 extends Animal1{
	public Fish1(String name){
		super(name);
	}
	public void run(){
		System.out.println(name+"摇摇尾巴游走了");
	}
}


public class DuoTai {
	public static void main(String[] args) {
		/*Mouse m = new Mouse("老鼠");
		m.run();*/
		/*
		 * 多态
		 * */
		Animal1 a = new Mouse("老鼠"); //别人要一个动物，给一个老鼠，没毛病
		a.run();
	}
}
