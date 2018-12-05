package LianXiZ18;
/*建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等成员变量。
并通过不同的构造方法创建实例。至少要求：  汽车能够加速，减速，停车。 再定义一个小汽车类Car，
继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法  */
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
			System.out.println("滚去修车");
		else
			System.out.println("加速");
	}
	public void down(){
		if(wheel != 4)
			System.out.println("滚去修车");
		else
			System.out.println("减速");
	}
	public void stop(){
		System.out.println("停车");
	}
}
