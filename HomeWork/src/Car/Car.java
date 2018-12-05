package Car;
/*6、按要求编写Java应用程序。
（1）创建一个叫做机动车的类：
属性：车牌号(String)，车速(int)，载重量(double)
功能：加速(车速自增)、减速(车速自减)、修改车牌号，查询车的载重量。
编写两个构造方法：一个没有形参，在方法中将车牌号设置“XX1234”，速
度设置为100，载重量设置为100；另一个能为对象的所有属性赋值；
（2）创建测试类：
在主类中创建两个机动车对象。
创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“辽
A9752”，并让其加速。
创建第二个时调用有参数的构造方法，使其车牌为“京B5086”,车速为150,
载重为200，并让其减速。
输出两辆车的所有信息*/

public class Car {
	private String id ;
	private int speed ;
	private double zhong;
	public Car(){
		id = "辽A9752";
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
		System.out.println("我在加速");
		return speed ;
	}
	public int speedDown(){
		speed--;
		System.out.println("我在减速");
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
