package LianXiZ18;
/*建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等成员变量。
并通过不同的构造方法创建实例。至少要求：  汽车能够加速，减速，停车。 再定义一个小汽车类Car，
继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法  */
public class Car extends Auto{
	private String KongTiao ;
	private String CD ;
	public Car(int wheel, String color, int weight, int speed, String kongTiao, String cD) {
		super(wheel, color, weight, speed);
		KongTiao = kongTiao;
		CD = cD;
	}
	public Car(){}
	public String getKongTiao() {
		return KongTiao;
	}
	public void setKongTiao(String kongTiao) {
		KongTiao = kongTiao;
	}
	public String getCD() {
		return CD;
	}
	public void setCD(String cD) {
		CD = cD;
	}
	public void up(){
		if(super.getWheel() != 4)
			System.out.println("滚去修车!!!!!");
		else
			System.out.println("加速!!!!");
	}
	public void down(){
		if(super.getWheel() != 4)
			System.out.println("滚去修车!!!!");
		else
			System.out.println("减速!!!!");
	}
	public void stop(){
		System.out.println("停车!!!!!");
	}
}
