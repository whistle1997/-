package day08;
/*
 * 当前问题：父类的功能无法满足子类需求
 *	
 *方法是重写：子父类出现了同名的函数
 *什么时候用：父类的功能无法满足子类的需求
 *方法的重载：
 *	在一个类中存在两个或两个以上同名方法
 *重写：
 *	必须有父类
 * 	要注意：
 * 		1、方法名与形参列表必须一致
 * 		2、父类权限要小于等于子类权限
 * 		3、子类返回值类型小于等于父类返回值类型
 * 		4、子类抛出异常类型小于等于父类抛出的异常类型
 * */
class Fu1{
	String name ;
	public Fu1(String name){
		this.name = name;
	}
	public void eat(){
		System.out.println(name+"吃番薯");
	}
}
class Zi1 extends Fu1{
	String num ;
	public Zi1(String name){
		super(name);
	}
	//方法的重写
	public void eat(){
		System.out.println("吃KFC");
	}
}
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi1 z = new Zi1("狗蛋");
		z.eat();
	}

}
