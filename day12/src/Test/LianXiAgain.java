package Test;

import org.junit.Test;

public class LianXiAgain {
	@Test
	public void test1(){
		//ƴ���ַ���
		//����һ
		String str = "wsl";
		String str1 = str.concat("cst");
		System.out.println(str1);
		//������
		String str2 = str + "cst" ;
		System.out.println(str2);
	}
	@Test
	public void test2(){
		//�����ַ������±�
		String str = "wslcst";
		int index = str.indexOf("s"); // ��ͷ��s��һ�γ��ֵĽǱ�
		int index2 = str.indexOf("s" , 3) ; // �ӽǱ�Ϊ3����s��һ�γ��ֵĽǱ�
		System.out.println(index +"=====" + index2);// 1      4
		int index3 = str.lastIndexOf("s"); // ����s���һ�γ��ֵĽǱ�
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
		//��ȡ�ַ�����һ���Ӵ�
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
		//�ж������ַ����Ƿ����equals
		String str = "abc";
		String str1 = "Abc";
		System.out.println(str.equals(str1)); //�Ƚ������ַ����Ƿ���ͬ�����ִ�Сд
		System.out.println(str.equalsIgnoreCase(str1));// �����ִ�Сд
	}
	@Test
	public void test6(){
		//�ж��Ƿ����ĳ�ַ���
		String str = "wslcst" ;
		boolean flag = str.contains("cst");
		System.out.println(flag);
	}
	@Test
	public void test7(){
		//�ж��Ƿ���ĳ�ַ�����ͷ����β��
		String str = "wslcst" ;
		boolean flag = str.startsWith("ws");
		boolean fl = str.endsWith("st");
		System.out.println(flag + "===" + fl);
	}
	@Test
	public void test8(){
		
	}
}
