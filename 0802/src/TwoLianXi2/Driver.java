package TwoLianXi2;
/*ѵ�����ܵ�
��������
����˵��
����ʵ�����У�����һ��˾�����Լ�ʻ�γ����ͳ��ͻ���������Ҫ��ʹ�÷���������ʵ������������
ʵ�ֲ���
(1) �����γ��ࡢ�ͳ���ͻ����࣬�����Զ���
(2) ����˾���࣬�����Զ���
(3) ��˾��������Խγ����ͳ��ͻ����ֱ𴴽�������ʻ������
(4) ���������ಢ���в��ԡ�
*/
public class Driver {
	private String name ;
	private int age ;
	
	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Driver(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Car(){
		new Car().car();
	}
	public void HuoCar(){
		new HuoCar().huocar();
	}
	public void KeCar(){
		new KeCar().kecar();
	}
}
