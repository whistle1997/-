package Car;
/*6����Ҫ���дJavaӦ�ó���
��1������һ���������������ࣺ
���ԣ����ƺ�(String)������(int)��������(double)
���ܣ�����(��������)������(�����Լ�)���޸ĳ��ƺţ���ѯ������������
��д�������췽����һ��û���βΣ��ڷ����н����ƺ����á�XX1234������
������Ϊ100������������Ϊ100����һ����Ϊ������������Ը�ֵ��
��2�����������ࣺ
�������д�����������������
������һ��ʱ�����޲����Ĺ��췽�������ó�Ա����ʹ�䳵��Ϊ����
A9752������������١�
�����ڶ���ʱ�����в����Ĺ��췽����ʹ�䳵��Ϊ����B5086��,����Ϊ150,
����Ϊ200����������١�
�����������������Ϣ
*/
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.speedUp();
		Car c2 = new Car("��B5086" , 150 , 200);
		c2.speedDown();
		String id1 = c1.getId();
		int speed1 = c1.getSpeed();
		double zhong1 = c1.getZhong();
		String id2 = c2.getId();
		int speed2 = c2.getSpeed();
		double zhong2 = c2.getZhong();
		System.out.println("���ƺ�Ϊ"+id1+"�ĳ��ٶ�Ϊ"+speed1+"����"+zhong1);	
		System.out.println("���ƺ�Ϊ"+id2+"�ĳ��ٶ�Ϊ"+speed2+"����"+zhong2);	
	}

}
