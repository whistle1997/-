package LianXi2;
/*02.类的成员变量： 
请定义一个交通工具(Vehicle)的类，其中有: 属性：速度(speed)，体积(size)等等 
方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等. 
最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，并且通过打印出来。
另外，调用加速，减速的方法对速度进行改变。
*/
public class Vehicle {
	private int speed ; 
	private String size ;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void move(){//移动
		System.out.println("溜了溜了");
	}
	public int speedUp() {//加速
		speed += 10 ;
		return speed ;
	}
	public int speedDown(){
		speed -= 10 ;
		return speed ;
	}
}
