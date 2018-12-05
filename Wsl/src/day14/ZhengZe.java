package day14;

import org.junit.Test;

public class ZhengZe {
	@Test
	public void test1(){
		//匹配QQ
		/*1、首位不能为0 ；
		 *2、长度5~12位
		 *3、不能有非数字
		 * */
		String qq = "1130321832";
		System.out.println((qq.matches("[1-9][0-9]{4,11}")?"合法QQ":"非法QQ"));
	}
	
	@Test
	public void test2(){
		String str = "大家家家家今天玩天天天得开开开开心";
		String reg = "(.)\\1+";
		String[] s = str.split(reg);
		for(String s1 : s)
			System.out.println(s1);
	}
}
