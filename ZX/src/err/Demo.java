package err;
/*
 * 	���ֲ������������ͳ���쳣
 * 
 * java��������������
 * �κ����ﶼ������������
 * sun�úܶ��������˺ܶ�java���������������Ϊ�쳣�࣬�ܶ��쳣��
 * �ѻ���һ���γ���java�е��쳣��ϵ��
 * 
 * Throwable���������������ࣺ
 * 		1��Error�����󣩣��������ƣ���
 * 			
 * 
 * 		2��Exception���쳣���������ƣ�
 * 			�ɱ���Ϊ����
 * 			һ������ʱ�쳣�����ô��������һ�������ڲ��׳���һ�������쳣����ô�����Ͽ�������
 * 								Ҳ���Բ�����
 * 			��������ʱ�쳣��һ��ҪȥҽԺ����
 * 	����ʱ�쳣��RuntimeException
 * 
 * 
 * 
 * Throwable ���÷���
 * 	toString():����Throwable�ļ�����������ص�ǰ�쳣�������������+��̬��Ϣ
 * getMessage():���ص��Ǵ���throwable������ַ�����Ϣ
 * printStackTrace():��ӡ�쳣��ջ��Ϣ�� ��һ�г������⣬��������һ�г�������
 * 
 * 
 * ERROR һ��������JVM����Ӳ�����������⣬��������һ�㲻��ͨ�����봦�����
 * exception �쳣  ����Ҫͨ������ȥ����
 * 
 * 
 * 
 * ������ִ������쳣
 * 		�����������˲�������Ϣ���������������Ϣ����������Error��β�ģ���ô�϶���һ������
 * 		�������exception��β�ģ���ô�϶���һ���쳣
 * 
 * 
 * 
 * 
 * */
public class Demo {
	public static void main(String[] args) {
		/*Throwable t = new Throwable("ͷ�Σ���ð");//������Throwable����
		//�������󲢴��벡̬��Ϣ
		String info = t.toString();
		String message =t.getMessage();
		System.out.println("toString:"+info);//java.lang.Throwable����+����
		System.out.println("getMassage"+message);
		*/
		test();
	}
	public static void test(){
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
 