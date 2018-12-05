package err;
/*
 * 	出现不正常的情况，统称异常
 * 
 * java是面向对象的语言
 * 任何事物都可以用类描述
 * sun用很多类描述了很多java不正常的情况，称为异常类，很多异常类
 * 堆积在一起，形成了java中的异常体系。
 * 
 * Throwable（病）有两个子类：
 * 		1、Error（错误）（不可治疗））
 * 			
 * 
 * 		2、Exception（异常）（可治疗）
 * 			可被分为两种
 * 			一、运行时异常（不用处理）：如果一个方法内部抛出了一个运行异常，那么方法上可以声明
 * 								也可以不处理
 * 			二、编译时异常（一定要去医院处理）
 * 	运行时异常：RuntimeException
 * 
 * 
 * 
 * Throwable 常用方法
 * 	toString():返回Throwable的简短描述，返回当前异常对象的完整类名+病态信息
 * getMessage():返回的是创建throwable传入的字符串信息
 * printStackTrace():打印异常的栈信息。 哪一行出现问题，并导致哪一行出现问题
 * 
 * 
 * ERROR 一般是由于JVM或者硬件引发的问题，所以我们一般不会通过代码处理错误
 * exception 异常  是需要通过代码去处理。
 * 
 * 
 * 
 * 如何区分错误与异常
 * 		如果程序出现了不正常信息，如果不正常额信息的类名是以Error结尾的，那么肯定是一个错误
 * 		如果是以exception结尾的，那么肯定是一个异常
 * 
 * 
 * 
 * 
 * */
public class Demo {
	public static void main(String[] args) {
		/*Throwable t = new Throwable("头晕，感冒");//创建了Throwable对象
		//创建对象并传入病态信息
		String info = t.toString();
		String message =t.getMessage();
		System.out.println("toString:"+info);//java.lang.Throwable包名+类名
		System.out.println("getMassage"+message);
		*/
		test();
	}
	public static void test(){
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
 