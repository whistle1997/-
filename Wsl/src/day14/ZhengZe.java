package day14;

import org.junit.Test;

public class ZhengZe {
	@Test
	public void test1(){
		//ƥ��QQ
		/*1����λ����Ϊ0 ��
		 *2������5~12λ
		 *3�������з�����
		 * */
		String qq = "1130321832";
		System.out.println((qq.matches("[1-9][0-9]{4,11}")?"�Ϸ�QQ":"�Ƿ�QQ"));
	}
	
	@Test
	public void test2(){
		String str = "��ҼҼҼҽ�����������ÿ���������";
		String reg = "(.)\\1+";
		String[] s = str.split(reg);
		for(String s1 : s)
			System.out.println(s1);
	}
}
