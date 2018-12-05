package LianXi4;
/*构造方法 
编写Java程序，模拟简单的计算器。 
定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。
编写构造方法，赋予n1和n2初始值，再为该类定义加（addition）、减（subtration）、
乘（multiplication）、除（division）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。 
在main方法中创建Number类的对象，调用各个方法，并显示计算结果。*/

public class Number {
	private int n1 , n2 ;
	public Number(int n1 , int n2){
		this.n1 = n1 ;
		this.n2 = n2 ;
	}
	public int addition(){
		int n = n1 + n2;
		return n ;
	}
	public int subtration(){
		int n = n1 - n2 ;
		return n ;
	}
	public int mult(){
		int n = n1 * n2 ;
		return n ;
	}
	public double div(){
		double x = n1 ;
		double x2 = n2 ;
		double n = x / x2 ;
		return n ;
	}
}
