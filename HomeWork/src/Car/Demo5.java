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
输出两辆车的所有信息
*/
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.speedUp();
		Car c2 = new Car("京B5086" , 150 , 200);
		c2.speedDown();
		String id1 = c1.getId();
		int speed1 = c1.getSpeed();
		double zhong1 = c1.getZhong();
		String id2 = c2.getId();
		int speed2 = c2.getSpeed();
		double zhong2 = c2.getZhong();
		System.out.println("车牌号为"+id1+"的车速度为"+speed1+"载重"+zhong1);	
		System.out.println("车牌号为"+id2+"的车速度为"+speed2+"载重"+zhong2);	
	}

}
