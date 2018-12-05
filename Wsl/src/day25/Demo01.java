package day25;

import java.lang.reflect.Constructor;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Class<?> c = null ;//创建一个class对象，try  catch捕获创建时的异常
		try {
			c = Class.forName("day25.Person"); //创建了class对象代表Person类
		} catch (Exception e) {
			// TODO: handle exception
		}
		Person p = null ;
		try{
			
			p = (Person)c.newInstance();  //使用无参构造方法
		}catch(Exception e){
			
		}
		System.out.println(p);
		Constructor<?> con = null ;
		try {
			con = c.getConstructor(String.class , int.class); //有参构造方法,如果（）中不写，则调用无参
			Person p1 = (Person)con.newInstance("zhangsan" , 18) ; // 向构造函数传参，如果无参，则只写括号
			System.out.println(p1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
