package FixCar;

	/*	2：汽车修理厂
	属性：		1：有名字、					2：有地址
	行为：		3：有修理汽车的方法*/



public class FixCar {
	private String name ;
	private String address ;
	public FixCar(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int fix(int wheel){
		for(int i = wheel ; i < 4 ; i++){
			wheel++;
		}
		return wheel;
	}
}
