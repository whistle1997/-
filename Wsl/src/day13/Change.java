package day13;

import org.junit.Test;

public class Change {
	@Test
	public void test1(){
		int num = 128 ;
		//基本转包装
		Integer in = new Integer(num) ;
		Integer in2 = Integer.valueOf(num) ;
		//包装转基本
		int num1 = in.intValue();
		String str = "123" ;
		//字符串转基本
		int num3 = Integer.parseInt(str) ;
		//基本转字符串
		String str1 = "num1" + "" ;
		String str2 = String.valueOf(num);
		String str3 = Integer.toString(num);
	}
}
