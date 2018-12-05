package FixCar;


/*		
属性： 	1：汽车有轮子		2：有颜色	3：有名字 成员变量
			行为：4：有运行的方法        函数（方法）*/
		


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
		System.out.println("车有四个轮子，稳滴很");
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
