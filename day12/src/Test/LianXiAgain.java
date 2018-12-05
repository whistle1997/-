package Test;

import org.junit.Test;

public class LianXiAgain {
	@Test
	public void test1(){
		//拼接字符串
		//方法一
		String str = "wsl";
		String str1 = str.concat("cst");
		System.out.println(str1);
		//方法二
		String str2 = str + "cst" ;
		System.out.println(str2);
	}
	@Test
	public void test2(){
		//根据字符串找下标
		String str = "wslcst";
		int index = str.indexOf("s"); // 从头找s第一次出现的角标
		int index2 = str.indexOf("s" , 3) ; // 从角标为3处找s第一次出现的角标
		System.out.println(index +"=====" + index2);// 1      4
		int index3 = str.lastIndexOf("s"); // 查找s最后一次出现的角标
		System.out.println(index3); // 4
		
	}
	@Test
	public void test3(){
		String str = "wsl" ;
		char c = str.charAt(0);
		System.out.println(c); //w
	}
	@Test
	public void test4(){
		//获取字符串的一段子串
		String str = "abcd" ;
		for(int i = 0 ; i < str.length() ; i++){
			for(int start = 0 , end = str.length() - i ; end <= str.length() ; start++ , end++){
				System.out.print(str.substring(start, end)+"\t");
			}
			System.out.println();
		}
	}
	@Test
	public void test5(){
		//判断两个字符串是否相等equals
		String str = "abc";
		String str1 = "Abc";
		System.out.println(str.equals(str1)); //比较两个字符串是否相同，区分大小写
		System.out.println(str.equalsIgnoreCase(str1));// 不区分大小写
	}
	@Test
	public void test6(){
		//判断是否包含某字符串
		String str = "wslcst" ;
		boolean flag = str.contains("cst");
		System.out.println(flag);
	}
	@Test
	public void test7(){
		//判断是否以某字符串开头（结尾）
		String str = "wslcst" ;
		boolean flag = str.startsWith("ws");
		boolean fl = str.endsWith("st");
		System.out.println(flag + "===" + fl);
	}
	@Test
	public void test8(){
		
	}
}
