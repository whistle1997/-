package LianXiZ18;
/*����һ������Auto�࣬������̥������������ɫ�������������ٶȵȳ�Ա������
��ͨ����ͬ�Ĺ��췽������ʵ��������Ҫ��  �����ܹ����٣����٣�ͣ���� �ٶ���һ��С������Car��
�̳�Auto������ӿյ���CD�ȳ�Ա���������Ǽ��٣����ٵķ���  */
public class Auto {
	private int wheel ;
	private String color ;
	private int weight ;
	private int speed ;
	public Auto(int wheel, String color, int weight, int speed) {
		super();
		this.wheel = wheel;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	public Auto() {
		
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void up(){
		if(wheel != 4)
			System.out.println("��ȥ�޳�");
		else
			System.out.println("����");
	}
	public void down(){
		if(wheel != 4)
			System.out.println("��ȥ�޳�");
		else
			System.out.println("����");
	}
	public void stop(){
		System.out.println("ͣ��");
	}
}
