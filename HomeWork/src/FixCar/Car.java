package FixCar;


/*		
���ԣ� 	1������������		2������ɫ	3�������� ��Ա����
			��Ϊ��4�������еķ���        ������������*/
		


public class Car {
	private int wheel ;
	private String color ;
	private String name ;
	public Car(int wheel, String color, String name) {
		super();
		this.wheel = wheel;
		this.color = color;
		this.name = name;
	}
	public void run(){
		System.out.println("�����ĸ����ӣ��ȵκ�");
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
