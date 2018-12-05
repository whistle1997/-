package day26;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Lambda���ʽ
//�Ĵ���ĺ���ʽ�ӿ�
public class Demo02 {

	public static void main(String[] args) {
		
		//Consumer<T> ������ΪT�Ķ���Ӧ�ò�������������      void accept(T t)
		Consumer<String> con = s -> System.out.println(s); //�˴���s��Ϊ�βΣ���Ҫ�����Ժ���ʵ��ʹ��
		con.accept("afsdfdsfs");
		//��һ���������޷���ֵ��()��ʡ��
		
		//Supplier<T>  ��������ΪT�Ķ��󣬰�������  T get()
		Supplier<String> sup = () -> "dududududud" ;
		System.out.println(sup.get());
		//�޲������з���ֵ��()����ʡ�� �� return ��ʡ��
		
		//Function<T , R>  ������ΪT�Ķ�����в����������ؽ�������ΪR���ͣ��������� R apply(T t)
		Function<String , Integer > fun = t -> t.length();
		System.out.println(fun.apply("sdfkjaskjdhfkj"));
		
		//Predicate<T> ȷ������ΪT�Ķ����Ƿ�����ĳԼ���������ز���ֵ���������� boolean test(T t)
		Predicate<String> pre = t -> t.length() > 3 ;
		System.out.println(pre.test("dsfsdgfdsg"));
		
	}

}
