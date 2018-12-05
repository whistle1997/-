package LianXiZ13;
/*构造方法与重载 
创建一个类，为该类定义三个构造函数，分别执行下列操作：  
 1、传递两个整数值并找出其中较大的一个值  
 2、传递三个double值并求出其乘积   
3、传递两个字符串值并检查其是否相同   
4、在main方法中测试构造函数的调用*/

public class Num {
	public Num(int a , int b){
		if(a > b)
			System.out.println(a);
		else if(b > a )
			System.out.println(b);
		else
			System.out.println("等");
	}
	public Num(double a , double b , double c){
		double x = a * b * c ;
		System.out.println(x);
	}
	public Num(String str , String str2){
		if(str.equals(str2))
			System.out.println("一样");
		else
			System.out.println("不一样");
	}
}
