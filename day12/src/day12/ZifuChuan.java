package day12;

import org.junit.Test;

public class ZifuChuan {
	@Test
	public void test(){//�����ַ�������1
		String str = "helloworld";
		char[] ch = str.toCharArray();
		for(char c : ch){
			System.out.print(c + " ");
		}
	}
	@Test
	public void test1(){//�����ַ�������2
		String str = "helloworld" ;
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			System.out.print(c + " ");
		}
		
	}
	@Test
	public void test2(){//ƴ���ַ���
		//����һ
		String str = "hello";
		String s = str.concat("world");
		System.out.println(s);
		//������
		String s1 = str + "world" ;
		System.out.println(s1);
		//���÷���������Ϊʹ��concat������Ҫ�����ռ䣬�˷��ڴ�
	}
	
	@Test
	public void test3(){
		String str = "helloworld" ;
		int index = str.indexOf("o");//�����ַ����е�һ�γ��ֵ�λ��
		System.out.println(index);
		int index2 = str.indexOf("o" , 3) ; //��ָ��λ�ÿ�ʼ�����ַ���һ�γ��ֵ�λ�á�
		System.out.println(index2);
		int index3  = str.lastIndexOf("o") ;// ����ָ���ַ����һ�γ��ֵ�λ��
		System.out.println(index3);
	}
	@Test
	public void test4(){
		String str = "helloworld";
		String s = str.substring(2);//�ӽǱ�Ϊ2���ַ���ʼ����ȡ��ĩβ
		System.out.println(s);
		String s1 = str.substring(2, 7) ; // �ӽǱ�Ϊ2���ַ���ʼ����ȡ��7-1 ��
		System.out.println(s1);
	}
	@Test
	public void test5(){
		String s1 = "hello" ; 
		String s2 = "hello" ; 
		System.out.println(s1.equals(s2)); // �Ƚ������ַ��������Ƿ���ͬ���˺����룩
		String s3 = "hello" ; 
		String s4 = "Hello" ; 
		System.out.println(s1.equalsIgnoreCase(s2)); // �Ƚ������ַ��������Ƿ���ͬ�������Դ�Сд����֤�룩
	}
	@Test
	public void test6(){
		String s = "helloworld" ;
		char[] ch = s.toCharArray(); // ���ַ���װ��Ϊ�ַ�����
		byte[] b = s.getBytes(); // ���ַ���ת��Ϊbyte���飻
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
		System.out.println(str.compareTo(str1));//����һλ����ͬ���ַ����в��������õ�һ��int���ͽ����ǰ����
	}
	@Test
	public void test8(){
		String str = "";//����һ�����ַ���
		String str1 = null;//����û��String����
		System.out.println(str.isEmpty());// �ж�ָ���ַ����Ƿ�Ϊ��
	}
	@Test
	public void test9(){
		String s = "   abc   ";
		String s1 = s.trim();//ɾ���ַ������˵Ŀո�
		System.out.println(s1);
	}
	@Test
	public void test10(){ 
		String str = "abcz123zjavaz456";
		String[] s = str.split("z"); //��zΪ��־�и��ַ��� �� �����浽һ��String���͵������С�
		for(String st : s)
			System.out.println(st);
	}
}
