package LianXiZ26;
/*����һ�������"Role"�࣬�����������䣬�Ա�ȳ�Ա���� 
1. Ҫ�󾡿����������б���(�ܹ�˽�о�˽��,�ܹ������Ͳ�Ҫ����)����ͨ
��GetXXX()��SetXXX()�����Ը��������ж�д������һ�������play()������
�÷����������κ�ֵ��ͬʱ���ٶ����������췽����Role����Ҫ���ֳ�this�ļ����÷��� 
2. ��Role��������һ��"Employee"�࣬�������Role������г�Ա����
�췽�����⣩������չ salary��Ա������ͬʱ����һ����̬��Ա������ְ����ţ�ID������
ͬ��Ҫ�������������췽����Ҫ���ֳ�this��super�ļ����÷�����Ҫ�󸲸�play()���������ṩһ��final sing()������
3. "Manager"��̳�"Employee"�࣬��һ��final��Ա����"vehicle" 
4. ��main()����������Manager��Employee����,��������Щ����ķ���*/

abstract class Role {
	private int x ;

	public Role(int x) {
		super();
		this.x = x;
	}
	public Role(){}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	abstract void play();
}
