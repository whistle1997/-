package TwoLianXi2;
/*训练技能点
方法重载
需求说明
在现实生活中，假设一个司机可以驾驶轿车、客车和货车。现在要求使用方法重载来实现这个生活案例。
实现步骤
(1) 创建轿车类、客车类和货车类，属性自定。
(2) 创建司机类，属性自定。
(3) 在司机类中针对轿车、客车和货车分别创建三个驾驶方法。
(4) 创建测试类并进行测试。
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
