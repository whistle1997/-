package day26;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Lambda表达式
//四大核心函数式接口
public class Demo02 {

	public static void main(String[] args) {
		
		//Consumer<T> 对类型为T的对象应用操作，包含方法      void accept(T t)
		Consumer<String> con = s -> System.out.println(s); //此处的s均为形参，需要创建以后传入实参使用
		con.accept("afsdfdsfs");
		//有一个参数，无返回值，()可省略
		
		//Supplier<T>  返回类型为T的对象，包含方法  T get()
		Supplier<String> sup = () -> "dududududud" ;
		System.out.println(sup.get());
		//无参数，有返回值，()不可省略 ， return 可省略
		
		//Function<T , R>  对类型为T的对象进行操作，并返回结果，结果为R类型，包含方法 R apply(T t)
		Function<String , Integer > fun = t -> t.length();
		System.out.println(fun.apply("sdfkjaskjdhfkj"));
		
		//Predicate<T> 确定类型为T的对象是否满足某约束，并返回布尔值，包含方法 boolean test(T t)
		Predicate<String> pre = t -> t.length() > 3 ;
		System.out.println(pre.test("dsfsdgfdsg"));
		
	}

}
