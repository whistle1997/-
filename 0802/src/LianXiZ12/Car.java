package LianXiZ12;
/*���췽�������� 
����һ�������࣬������̥������������ɫ���������������ԡ���ͨ����ͬ�Ĺ��췽������������ 
  ����Ҫ�������ܹ����٣����٣�ͣ����   
  Ҫ�������淶���������ֲ�Σ����ѺõĲ�����ʾ��
*/
public class Car {
	private int wheel ;
	private String color ;
	private int weight ;
	public Car(int wheel, String color, int weight) {
		super();
		this.wheel = wheel;
		this.color = color;
		this.weight = weight;
	}
	public Car(){}
	
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
