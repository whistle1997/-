package Bank;
/*2����дJavaӦ�ó���
���ȶ���һ�����������˻���Account�࣬������Ա��
�����˺š��͡����������Ա�����С�������ȡ��͡�����ѯ������Σ�
��дһ�����࣬�������в���Account��Ĺ��ܡ�*/

public class Demo2 {
	public static void main(String[] args) {
		Account a = new Account(110, 10000);
		
		System.out.println("��Ǯ�����Ϊ:"+a.Cun(2000));
		System.out.println("ȡǮ�����Ϊ��"+a.Qu(3000));
		System.out.println("һ�����绢�����Ϊ��"+a.getYuE());
	}
}
