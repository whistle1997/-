package err;
/*
 * 抛出处理
 * throw 和 throws
 * 要注意的事宜：
 * 	1、如果一个方法内部抛出了一个异常对象，那么必须在方法上声明
 * 	抛出
 *  2、如果调用了一个声明抛出异常的方法，那么调用者必须要处理异常
 *  3、如果一个方法内部抛出了一个异常对象，那么throw后面的代码都
 *  不会再执行。（一个方法遇到throw关键字，该方法也会停止执行的）
 *  4、在一种情况下，只能抛出一种异常类型。
 *  
 * throw和throws两个关键字
 * 	1、throw是用于方法内部的，throws是用于方法声明上的
 * 	2、throw是用于方法内部抛出一个异常对象的，throws是用于在方法声明
 * 上声明抛出异常类型的
 * 	3、throw关键字后边只能有一个异常对象，throws后边一次可以声明抛出
 * 多个异常。
 * 	
 * 
 * 
 * 疑问：抛出处理何时使用？
 * 		如果需要通知调用者，代码出现问题，这时候就是用抛出处理
 * 		
 * 		如果代码与用户打交道的遇到异常千万不要再抛，再抛就给用户了。这时候
 *   应该使用捕获处理。
 * 
 * */
public class Demo3 {
	
	public static void main(String[] args){
		try {
			div(4,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//调用了声明抛出异常类型的方法，必须有预防措施
		System.out.println(".........");
	}
	public static void div(int a , int b) throws Exception{// 声明抛出
		if(b == 0){
			throw new Exception() ; //抛出一个异常对象
		}
		int c = a/b;
		System.out.println(c);
	}
}
