package err;

//java.lang.ArithmeticException: / by zero
//at err.Demo2.div(Demo2.java:8)
//at err.Demo2.main(Demo2.java:5)
//��printStackTrace������ӡ������

/*����printStackTrace��������ô�쳣������Ķ�����
 * 	
 *	 java��������е�a/b��ʱ���ֳ���Ϊ0������ʵ���������ڲ��������
 * jvm һ���������ֲ������������ôjvm�ͻ����ϴ���һ���쳣����
 * �����ҵ�����������printStackTrace����������
 * 
 * 
 * �쳣�����ó������ִ�У���
 * 	��ʽһ��������
 * 	 ��ʽ��
 * 		try{
 * 			���ܷ����쳣�Ĵ���
 * 		}catch��������쳣���� ��������{
 * 			�����쳣�Ĵ���....
 * 		}
 * 
 *	 	����һ���쳣�Ĵ���о�û�У���Ϊ������������ѣ�
 *			�쳣����ǳ����ã�ֻ������Ŀǰ֪ʶ�㲻��
 *			
/* 		���ʶ����Ժ��Ƿ���ǲ���exception���ɣ�
 * 			�� ��Ϊ��������ʵ������������ͬ���쳣���͵�ʱ��
 * 			�������в�ͬ�Ĵ���ʽ������Ҫ�ֿ���ͬ���쳣���ʹ���
 * 
 *
 * 		Ҫע���ϸ�ڣ�	
 * 			1�����try���еĴ���������쳣�����������Ժ���ôtry-catch��
 * 			����Ĵ����������ִ�С�
 * 			
 * 			2�����try���г������쳣�Ĵ��룬��ô��try���г����쳣����
 * 			��ߵĴ����ǲ���ִ�еġ�
 * 			
 * 			3��һ��try�����ǿ��Ը����catch��ģ�Ҳ����һ��try����Բ���
 * 			�����쳣������
 * 			4��һ��try����Բ�������쳣�����ͣ����ǲ�����쳣���ͱ����С����
 * 			���񣬷�����뱨��
 * 
 * 
 * ��ʽ�����׳�����
 * 
 * 
 * 
 * */
public class Demo2 {
	public static void main(String[] args) {
		int[] arr = null ;
		div(4,2, arr);
	}
	public static void div(int a , int b , int[] arr){
		int c = 0 ;
		try{
			c = a / b ;//�п����쳣,jam����仰�����˲�����������ͻᴴ��һ����Ӧ���쳣����
			System.out.println(arr.length);
		}catch(ArithmeticException e){
			//�����쳣�Ĵ���
			System.out.println("toString"+e.toString());
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ���쳣");
		}
		System.out.println("c =" + c);
	}
}
