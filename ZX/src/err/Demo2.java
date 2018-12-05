package err;

//java.lang.ArithmeticException: / by zero
//at err.Demo2.div(Demo2.java:8)
//at err.Demo2.main(Demo2.java:5)
//由printStackTrace方法打印出来的

/*调用printStackTrace方法，那么异常对象从哪儿来？
 * 	
 *	 java虚拟机运行到a/b的时候发现除数为0，在现实生活中属于不正常情况
 * jvm 一旦发现这种不正常情况，那么jvm就会马上创建一个异常对象
 * ，并且调用这个对象的printStackTrace方法来处理。
 * 
 * 
 * 异常处理（让程序继续执行）：
 * 	方式一：捕获处理
 * 	 格式：
 * 		try{
 * 			可能发生异常的代码
 * 		}catch（捕获的异常类型 变量名）{
 * 			处理异常的代码....
 * 		}
 * 
 *	 	疑问一：异常的处理感觉没有，因为都是输出语句而已？
 *			异常处理非常有用，只不过是目前知识点不够
 *			
/* 		疑问二：以后是否就是捕获exception即可？
 * 			错， 因为我们在现实开发中遇到不同的异常类型的时候
 * 			往往会有不同的处理方式。所以要分开不同的异常类型处理
 * 
 *
 * 		要注意的细节：	
 * 			1、如果try块中的代码出现了异常，经过处理以后，那么try-catch块
 * 			外面的代码可以正常执行。
 * 			
 * 			2、如果try块中出现了异常的代码，那么在try块中出现异常代码
 * 			后边的代码是不会执行的。
 * 			
 * 			3、一个try块后边是可以跟多个catch块的，也就是一个try块可以捕获
 * 			多种异常的类型
 * 			4、一个try块可以捕获多种异常的类型，但是捕获的异常类型必须从小到大
 * 			捕获，否则编译报错
 * 
 * 
 * 方式二：抛出处理
 * 
 * 
 * 
 * */
public class Demo2 {
	public static void main(String[] args) {
		int[] arr = null ;
		div(4,2, arr);
	}
	public static void div(int a , int b , int[] arr){
		int c = 0 ;
		try{
			c = a / b ;//有可能异常,jam在这句话发现了不正常情况，就会创建一个对应的异常对象
			System.out.println(arr.length);
		}catch(ArithmeticException e){
			//处理异常的代码
			System.out.println("toString"+e.toString());
		}catch(NullPointerException e){
			System.out.println("出现了空指针异常");
		}
		System.out.println("c =" + c);
	}
}
