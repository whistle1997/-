package Test;

import org.junit.Test;

public class StringLei {
	@Test
	public void test1(){
		//拼接字符串
		String str = "吴帅霖";
		//方法一
		String str2 = str.concat(",陈思彤");
		System.out.println(str2);
		//方法二
		String str3 = str + ",陈思彤";
		System.out.println(str3);
		//效果相同，但方法二更省内存
	}
	@Test
	public void test2(){
		//根据字符串找下标
		String str = "wslcst" ;
		int index = str.indexOf("w");//w第一次出现的角标
		int index2 = str.indexOf("c" , 2);//从角标为2的元素开始查找c第一次出现的角标
		System.out.println(index +"--"+ index2); // 如果找不到则输出-1
		int index3 = str.indexOf("wsl") ;
		int index4 = str.indexOf("cs", 3);
		System.out.println(index3+"--"+index4);
	}
	@Test
	public void test3(){
		//返回字符最后一次出现的位置
		String str = "wslcst";
		int index = str.lastIndexOf("c");//角标正数
		System.out.println(index);
	}
	@Test
	public void test4(){
		//根据下标找字符
		//q：得到某字符在字符串中的出现次数
		String str = "qefsdjfljeiasff";
		char key = 'f';
		int num = 0 ;
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == key)
				num++;
		}
		System.out.println(num);
	}
	@Test
	public void test5(){
		//获取字符串中的一段子串
		String str = "wslcst";
		String str1 = str.substring(3);//从第三位到结尾截取 得到 cst
		System.out.println(str1);
		String str2 = str.substring(0, 3); // 从低0位截取到第二位的字符，这是一个左闭右开区间
		System.out.println(str2);
	}
	@Test
	public void test6(){
		//判断两个字符串是否相同equals
		String str = "wsl" ;
		System.out.println(str.equals("wsl"));//比较两个字符串内容是否相同，区分大小写
		System.out.println(str.equalsIgnoreCase("Wsl"));//比较两个字符创内容是否相同，不区分大小写
	}
	@Test
	public void test7(){
		//判断是否包含指定字符串
		String str = "cstwsl" ;
		boolean flag = str.contains("cst");
		System.out.println(flag);
	}
	@Test
	public void test8(){
		//判断是否以指定字符串开头
		String str = "wslcst";
		boolean flag = str.startsWith("wsl");
		System.out.println(flag);
		boolean flag2 = str.endsWith("cst");
		System.out.println(flag2);
	}
	@Test
	public void test9(){
		//大小写装换
		String str = "wslcst";
		String Up = str.toUpperCase();//转为大写
		String Low = Up.toLowerCase();//转为小写
		System.out.println(Up);
		System.out.println(Low);
	}
	@Test
	public void test10(){
		//将其他类型转换为字符串类型
		int[] arr = {1,2,4,2,4,6};
		String Arr = String.valueOf(arr);//不能转int类型数组
		/*String Arr1 = "" ;
		for(int i = 0 ; i < arr.length ; i++){
			Arr1 += arr[i] ;
		}*/
		
		char[] ch = {'a' , 'r' , 'q' , '2'};
		String Ch = String.valueOf(ch);
		String Ch1 = new String(ch);
		int n = 2 ;
		String N = String.valueOf(n);
		System.out.println(Arr+"---"+Ch+"---"+N);
	}
	@Test
	public void test11(){
		//比较两个字符串大小
		String str = "wsl" ;
		String str1 = "cst";
		int Cha = str.compareTo(str1);
		System.out.println(Cha);
	}
	@Test
	public void test12(){
		String str = "";
		System.out.println(str.isEmpty());
	}
}
