package ZhengZe;

import java.util.Arrays;

/*
 * ������ʽ��Ҫ���ڲ����ַ����ģ�������ʽ���ַ����Ĳ�����Ҫ�����¼���Ӧ�ã�
 * 	ƥ�䣺 matches()
 * 			���󣺱�д������ʽƥ���ֻ���
 * 				��һλֻ��1��ͷ���ڶ�λ �� 3 4 5  7 8  ʣ��û�����ƣ�����11λ
 * 			����ƥ��̻�
 * 	�и split()
 * 			����:���ո��и�
 * 
 * 	�滻��
 * 
 * 
 * 
 * 	���ң�
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
		String reg = "1[34578]\\d{9}"; //�绰�ŵ�����
		System.out.println(phone.matches(reg)?"�Ϸ��ֻ���":"�Ƿ��ֻ���");
	}
	public static void matchesTel(String tel){
		String reg = "0\\d{2,3}-[1-9]\\d{6,7}";
		System.out.println((tel.matches(reg))?"�Ϸ��̻�":"�Ƿ��̻�");
	}
	public static void testPlit1(){
		String str = "��  ��  ��  ��";
		String[] datas = str.split(" +");
		System.out.println(Arrays.toString(datas));
	}
	public static void testPlit2(){
		//�����ص��ʽ����и�
		String str = "��ҼҼҼ�������������õõõõÿ���"; // ������� ��  ����
		String[] datas = str.split("(.)\\1+"); // ��������������Ҫ�����ã���ô��Ҫ����������ݽ��з��飬Ŀ�ģ������������
		//��Ų���ָ�����Ǵ�1��ʼ  \\1 �����һ������
		System.out.println(Arrays.toString(datas));
		
		/*
		 * ()��ʾ���飺Ϊ������������ݸ���������һ����Ҫ���ã�����Ҫ����
		 * 			����Ǵ�1��ʼ������ָ��
		 * 			((A)(B(C)))
		 * 			��һ�飺((A)(B(C)))
		 * 			�ڶ��飺(A)
		 * 			�����飺(B(C)
		 * 			�����飺(C)
		 * 
		 * \1 : ���õ�һ����ƥ�䵽������
		 * \2�����õڶ�����ƥ�������
		 * 
		 * 
		 * */
 	}
}
