package ZhengZe;

import java.util.Arrays;

/*
 * 正则表达式主要用于操作字符串的，正则表达式对字符串的操作主要有以下几种应用：
 * 	匹配： matches()
 * 			需求：编写正则表达式匹配手机号
 * 				第一位只能1开头，第二位 ： 3 4 5  7 8  剩下没有限制，长度11位
 * 			需求：匹配固话
 * 	切割： split()
 * 			需求:按空格切割
 * 
 * 	替换：
 * 
 * 
 * 
 * 	查找：
 * 
 * 
 * 
 * */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone = "13691386570";
		String tel = "0431-7566746";
		matchesPhone(phone);
		matchesTel(tel);
		//testPlit1();
		testPlit2();
	}
	public static void matchesPhone(String phone){
		String reg = "1[34578]\\d{9}"; //电话号的正则
		System.out.println(phone.matches(reg)?"合法手机号":"非法手机号");
	}
	public static void matchesTel(String tel){
		String reg = "0\\d{2,3}-[1-9]\\d{6,7}";
		System.out.println((tel.matches(reg))?"合法固话":"非法固话");
	}
	public static void testPlit1(){
		String str = "明  天  放  假";
		String[] datas = str.split(" +");
		System.out.println(Arrays.toString(datas));
	}
	public static void testPlit2(){
		//根据重叠词进行切割
		String str = "大家家家家明天天天天玩得得得得得开心"; // 结果：大 明  开心
		String[] datas = str.split("(.)\\1+"); // 如果正则的内容需要被复用，那么需要对正则的内容进行分组，目的：提高正则复用性
		//组号不能指定，是从1开始  \\1 代表第一组内容
		System.out.println(Arrays.toString(datas));
		
		/*
		 * ()表示分组：为了让正则的内容复用起来。一旦需要复用，都需要分组
		 * 			组号是从1开始，不能指定
		 * 			((A)(B(C)))
		 * 			第一组：((A)(B(C)))
		 * 			第二组：(A)
		 * 			第三组：(B(C)
		 * 			第四组：(C)
		 * 
		 * \1 : 引用第一组所匹配到的内容
		 * \2：引用第二组所匹配的内容
		 * 
		 * 
		 * */
 	}
}
