package TwoLianXi7;
/*������ý�屨�����ɶ�ĳ��ʦͶ����ǧ��Ԫ������һ�ֺ�½�����ܺ��еĽ�ͨ���ߡ�����Ҫ��ͨ���ӿ�ʵ�����������
ʵ�ֲ���
(1)	���������ӿ� Motor������һ�� run��������
(2)	�����ִ��ӿ� Steamer������һ�� sailing����������
(3)	�����ɻ��ӿ� Plane������һ�� fly����������
(4)	������ SuperVehicle ʵ�����������ӿڡ�
(5)	������������в��ԡ�*/

interface Motor {
	public static final int MOTOR_PRICE = 500000;
	abstract String run();
}
