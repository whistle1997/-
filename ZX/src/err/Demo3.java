package err;
/*
 * �׳�����
 * throw �� throws
 * Ҫע������ˣ�
 * 	1�����һ�������ڲ��׳���һ���쳣������ô�����ڷ���������
 * 	�׳�
 *  2�����������һ�������׳��쳣�ķ�������ô�����߱���Ҫ�����쳣
 *  3�����һ�������ڲ��׳���һ���쳣������ôthrow����Ĵ��붼
 *  ������ִ�С���һ����������throw�ؼ��֣��÷���Ҳ��ִֹͣ�еģ�
 *  4����һ������£�ֻ���׳�һ���쳣���͡�
 *  
 * throw��throws�����ؼ���
 * 	1��throw�����ڷ����ڲ��ģ�throws�����ڷ��������ϵ�
 * 	2��throw�����ڷ����ڲ��׳�һ���쳣����ģ�throws�������ڷ�������
 * �������׳��쳣���͵�
 * 	3��throw�ؼ��ֺ��ֻ����һ���쳣����throws���һ�ο��������׳�
 * ����쳣��
 * 	
 * 
 * 
 * ���ʣ��׳�������ʱʹ�ã�
 * 		�����Ҫ֪ͨ�����ߣ�����������⣬��ʱ��������׳�����
 * 		
 * 		����������û��򽻵��������쳣ǧ��Ҫ���ף����׾͸��û��ˡ���ʱ��
 *   Ӧ��ʹ�ò�������
 * 
 * */
public class Demo3 {
	
	public static void main(String[] args){
		try {
			div(4,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//�����������׳��쳣���͵ķ�����������Ԥ����ʩ
		System.out.println(".........");
	}
	public static void div(int a , int b) throws Exception{// �����׳�
		if(b == 0){
			throw new Exception() ; //�׳�һ���쳣����
		}
		int c = a/b;
		System.out.println(c);
	}
}