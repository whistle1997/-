package ZhengZe;
/*
 * ������ʽ
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Demo02 {

	public static void main(String[] args) {
		/*
		 * Ԥ�����ַ���
		 * 	. �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩
		 * 	\d���֣�[0~9]
		 * 	\D�����֣�[^0~9]
		 * 	\s�հ��ַ���[ \t\n\x0B\f\r]
		 * 	\S�ǿհ��ַ���[^\s]
		 * 	\w�����ַ���[a-z A-Z _ 0-9]
		 * 	\W�ǵ����ַ���[^\w]
		 * ע�⣺�κ�Ԥ�����ַ�û�м���������֮ǰ����ֻ��ƥ��һ���ַ�����
		 * 
		 * 
		 * 		
		 * */
		System.out.println("�����ַ���"+("a".matches(".")));
		System.out.println("�����ַ���"+("1".matches("\\d")));
		System.out.println("�������ַ���"+("@".matches("\\D")));
		System.out.println("�հ��ַ���"+("\r".matches("\\s")));
		System.out.println("�ǿհ��ַ���"+("a".matches("\\S")));
		System.out.println("�����ַ���"+("_".matches("\\w")));
		System.out.println("�ǵ����ַ���"+("@".matches("\\W")));
		
		/*
		 * �����ʣ�
		 * 	X ? X , �ʺű�ʾһ�λ���һ��Ҳû��
		 * 	X*  X, �Ǻű�ʾ0����
		 * 
		 * */
		System.out.println("?һ�λ���һ��Ҳû�У�"+("1".matches("\\d?")));
		System.out.println("* ��λ��߶�Σ�"+("123".matches("\\d*")));
		System.out.println("+ ���ٳ���һ�Σ�"+("1".matches("\\d+")));
		System.out.println("{n} ǡ�ó���n�Σ�"+("13991386570".matches("\\d{11}")));
		System.out.println("{����,} ����Ҫ���ֵĴ�����"+("123".matches("\\d{3,}")));
		System.out.println("{����1,����2} ָ�����ֵĴ�����Χ��"+("1233".matches("\\d{3,4}")));
		
		/*
		 *  ��Χ�ʣ����Ƴ����ַ��ķ�Χ
		 * 	ע�⣺��Χ�����治���ж೤��û����������϶�ֻ��ƥ��һ���ַ�
		 * */
		
		System.out.println("���ֵ��ַ�Ϊ����һ��"+("a".matches("[abc]"))); //û��������ֻ��ƥ��һ��
		System.out.println("��abc��"+("a".matches("^abc]")));
		System.out.println("�ַ����Գ�����a~zA~Z��$֮��:"+("a".matches("[a-zA-Z$]")));
	}

}
