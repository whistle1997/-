package LianXiZ12;
/*构造方法与重载 
建立一个汽车类，包括轮胎个数，汽车颜色，车身重量等属性。并通过不同的构造方法创建事例。 
  至少要求：汽车能够加速，减速，停车。   
  要求：命名规范，代码体现层次，有友好的操作提示。
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
