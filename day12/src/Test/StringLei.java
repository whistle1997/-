package Test;

import org.junit.Test;

public class StringLei {
	@Test
	public void test1(){
		//ƴ���ַ���
		String str = "��˧��";
		//����һ
		String str2 = str.concat(",��˼ͮ");
		System.out.println(str2);
		//������
		String str3 = str + ",��˼ͮ";
		System.out.println(str3);
		//Ч����ͬ������������ʡ�ڴ�
	}
	@Test
	public void test2(){
		//�����ַ������±�
		String str = "wslcst" ;
		int index = str.indexOf("w");//w��һ�γ��ֵĽǱ�
		int index2 = str.indexOf("c" , 2);//�ӽǱ�Ϊ2��Ԫ�ؿ�ʼ����c��һ�γ��ֵĽǱ�
		System.out.println(index +"--"+ index2); // ����Ҳ��������-1
		int index3 = str.indexOf("wsl") ;
		int index4 = str.indexOf("cs", 3);
		System.out.println(index3+"--"+index4);
	}
	@Test
	public void test3(){
		//�����ַ����һ�γ��ֵ�λ��
		String str = "wslcst";
		int index = str.lastIndexOf("c");//�Ǳ�����
		System.out.println(index);
	}
	@Test
	public void test4(){
		//�����±����ַ�
		//q���õ�ĳ�ַ����ַ����еĳ��ִ���
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
		//��ȡ�ַ����е�һ���Ӵ�
		String str = "wslcst";
		String str1 = str.substring(3);//�ӵ���λ����β��ȡ �õ� cst
		System.out.println(str1);
		String str2 = str.substring(0, 3); // �ӵ�0λ��ȡ���ڶ�λ���ַ�������һ������ҿ�����
		System.out.println(str2);
	}
	@Test
	public void test6(){
		//�ж������ַ����Ƿ���ͬequals
		String str = "wsl" ;
		System.out.println(str.equals("wsl"));//�Ƚ������ַ��������Ƿ���ͬ�����ִ�Сд
		System.out.println(str.equalsIgnoreCase("Wsl"));//�Ƚ������ַ��������Ƿ���ͬ�������ִ�Сд
	}
	@Test
	public void test7(){
		//�ж��Ƿ����ָ���ַ���
		String str = "cstwsl" ;
		boolean flag = str.contains("cst");
		System.out.println(flag);
	}
	@Test
	public void test8(){
		//�ж��Ƿ���ָ���ַ�����ͷ
		String str = "wslcst";
		boolean flag = str.startsWith("wsl");
		System.out.println(flag);
		boolean flag2 = str.endsWith("cst");
		System.out.println(flag2);
	}
	@Test
	public void test9(){
		//��Сдװ��
		String str = "wslcst";
		String Up = str.toUpperCase();//תΪ��д
		String Low = Up.toLowerCase();//תΪСд
		System.out.println(Up);
		System.out.println(Low);
	}
	@Test
	public void test10(){
		//����������ת��Ϊ�ַ�������
		int[] arr = {1,2,4,2,4,6};
		String Arr = String.valueOf(arr);//����תint��������
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
		//�Ƚ������ַ�����С
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
