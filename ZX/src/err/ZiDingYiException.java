package err;
/*
 * sun�ṩ�˺ܶ��쳣�࣬������������Ĳ�������� �����ṩ���쳣��
 * ��������������ʵ���������в������������ô��ʱ����Ҫ�����Զ����쳣��
 * 
 * 
 * ����ģ��feiQ����ʱû�����ߣ���ô���׳�һ��û�����ߵ��쳣�����������
 * ��ô������ʾ�����б�
 * 
 * �Զ����쳣��Ĳ���
 * 	1���Զ���һ����̳�Exception����
 * */

class NoIpException extends Exception{
	public NoIpException(String message){
		super(message);
	}
}
public class ZiDingYiException {
	public static void main(String[] args) {
		//String ip = "192.168.10.100";
		String ip = null;
		try{
			feiQ(ip);
		}catch(NoIpException e){
			e.printStackTrace();
			System.out.println("��������");
		}
	}
	public static void feiQ(String ip) throws NoIpException{
		if(ip == null){
			//�׳�һ��û�в������ߵ��쳣
			//throw new û�����쳣������
			throw new NoIpException("������");
		}
		System.out.println("������ʾ�����б�");
	}
}
