package day26;

import java.util.TreeSet;

@FunctionalInterface
interface MyInter{
	void show(String s) ;
}

@FunctionalInterface
interface MyInter2{
	int show(int i) ;
}

//Lambda表达式
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//无参，无返回值，（）不可省略
		Runnable run = () -> System.out.println("lambda表达式");
		new Thread(run).start();
		
		//有两个参数，且有返回值，参数类型可省略，return可省略
		TreeSet<String> ts = new TreeSet<>((s1 , s2) -> Integer.compare(s1.length(), s2.length()));
		ts.add("wdj");
		ts.add("wdjdbbwsl");
		System.out.println(ts);
		
		//有一个参数时，参数类型及()可省略
		
		String t = "dadadadadada" ;
		MyInter m = s -> System.out.println(s);
		//传参需要调用方法
		m.show(t);
		
		
		//lambda表达式只能进行方法定义，使用的均为形参，不能直接传入实参，传入实参需要通过对象调用该方法，将值传入。
		int i = 2 ;
		MyInter2 m2 = s -> s ;
		System.out.println(m2.show(i));
	}

}
