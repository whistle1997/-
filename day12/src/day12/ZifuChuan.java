package day12;

import org.junit.Test;

public class ZifuChuan {
	@Test
	public void test(){//遍历字符串方法1
		String str = "helloworld";
		char[] ch = str.toCharArray();
		for(char c : ch){
			System.out.print(c + " ");
		}
	}
	@Test
	public void test1(){//遍历字符串方法2
		String str = "helloworld" ;
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			System.out.print(c + " ");
		}
		
	}
	@Test
	public void test2(){//拼接字符串
		//方法一
		String str = "hello";
		String s = str.concat("world");
		System.out.println(s);
		//方法二
		String s1 = str + "world" ;
		System.out.println(s1);
		//常用方法二，因为使用concat方法需要创建空间，浪费内存
	}
	
	@Test
	public void test3(){
		String str = "helloworld" ;
		int index = str.indexOf("o");//查找字符串中第一次出现的位置
		System.out.println(index);
		int index2 = str.indexOf("o" , 3) ; //从指定位置开始查找字符第一次出现的位置。
		System.out.println(index2);
		int index3  = str.lastIndexOf("o") ;// 查找指定字符最后一次出现的位置
		System.out.println(index3);
	}
	@Test
	public void test4(){
		String str = "helloworld";
		String s = str.substring(2);//从角标为2的字符开始，截取到末尾
		System.out.println(s);
		String s1 = str.substring(2, 7) ; // 从角标为2的字符开始，截取到7-1 ；
		System.out.println(s1);
	}
	@Test
	public void test5(){
		String s1 = "hello" ; 
		String s2 = "hello" ; 
		System.out.println(s1.equals(s2)); // 比较两个字符的内容是否相同（账号密码）
		String s3 = "hello" ; 
		String s4 = "Hello" ; 
		System.out.println(s1.equalsIgnoreCase(s2)); // 比较两个字符串内容是否相同，并忽略大小写（验证码）
	}
	@Test
	public void test6(){
		String s = "helloworld" ;
		char[] ch = s.toCharArray(); // 将字符串装换为字符数组
		byte[] b = s.getBytes(); // 将字符串转换为byte数组；
		for(char c : ch)
			System.out.print(c + " ");
		
		System.out.println();
		for(byte by : b)
			System.out.print(by + " ");
	}
	@Test
	public void test7(){
		String str = "abcd" ; 
		String str1 = "abcde" ;
		System.out.println(str.compareTo(str1));//将第一位不相同的字符进行查表相减，得到一个int类型结果。前减后
	}
	@Test
	public void test8(){
		String str = "";//定义一个空字符串
		String str1 = null;//根本没有String对象
		System.out.println(str.isEmpty());// 判断指定字符串是否为空
	}
	@Test
	public void test9(){
		String s = "   abc   ";
		String s1 = s.trim();//删除字符串两端的空格
		System.out.println(s1);
	}
	@Test
	public void test10(){ 
		String str = "abcz123zjavaz456";
		String[] s = str.split("z"); //以z为标志切割字符串 ， 并保存到一个String类型的数组中。
		for(String st : s)
			System.out.println(st);
	}
}
