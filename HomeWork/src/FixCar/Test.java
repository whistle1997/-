package FixCar;

/*3������ʵ��
	1������������
	2����������������
4�����Դ���
	1��������������
	2���������������޷����С�
	3��������������
		1�����ó���
		2�����õ�ַ
	3���������Ͻ�����
		1�����������������޳���������������
	4��ȡ��
		1����������*/


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(3, "��ɫ", "����");
		FixCar f = new FixCar("��������", "����·3050");
		/*if(c.getWheel() < 4){
			f.fix(c.getWheel());
		}*/
		int wheel = f.fix(c.getWheel());
		if(wheel == 4){
			c.run();
		}
	}

}
