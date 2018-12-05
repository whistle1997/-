package FixCar;

/*3：代码实现
	1：定义汽车类
	2：定义汽车修理厂类
4：测试代码
	1：创建汽车对象
	2：汽车少了轮子无法运行。
	3：创建汽车修理厂
		1：设置厂名
		2：设置地址
	3：将汽车拖进修理厂
		1：运行汽车修理厂的修车方法，修理汽车
	4：取车
		1：开走汽车*/


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(3, "白色", "夏利");
		FixCar f = new FixCar("托尼汽修", "凯旋路3050");
		/*if(c.getWheel() < 4){
			f.fix(c.getWheel());
		}*/
		int wheel = f.fix(c.getWheel());
		if(wheel == 4){
			c.run();
		}
	}

}
