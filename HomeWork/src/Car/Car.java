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
�����������������Ϣ*/

public class Car {
	private String id ;
	private int speed ;
	private double zhong;
	public Car(){
		id = "��A9752";
		speed = 100;
		zhong = 100.0 ;
	}
	public Car(String id, int speed, double zhong) {
		super();
		this.id = id;
		this.speed = speed;
		this.zhong = zhong;
	}
	
	public int speedUp(){
		speed++;
		System.out.println("���ڼ���");
		return speed ;
	}
	public int speedDown(){
		speed--;
		System.out.println("���ڼ���");
		return speed;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getZhong() {
		return zhong;
	}
	public void setZhong(double zhong) {
		this.zhong = zhong;
	}
	public String changeId(String id){
		this.id = id ;
		return id;
		
	}
}
