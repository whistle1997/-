package day13;

import org.junit.Test;

public class Change {
	@Test
	public void test1(){
		int num = 128 ;
		//����ת��װ
		Integer in = new Integer(num) ;
		Integer in2 = Integer.valueOf(num) ;
		//��װת����
		int num1 = in.intValue();
		String str = "123" ;
		//�ַ���ת����
		int num3 = Integer.parseInt(str) ;
		//����ת�ַ���
		String str1 = "num1" + "" ;
		String str2 = String.valueOf(num);
		String str3 = Integer.toString(num);
	}
}
