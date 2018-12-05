package TwoLianXi7;

public class SuperVehicle implements Motor,Steamer , Plane{
	private String name ;
	private int price ;
	public SuperVehicle(String name) {
		super();
		this.name = name;
	}
	public String run(){
		return "可以在地上跑";
	}
	public String fly(){
		return "可以在天上飞";
	}
	public String sailing(){
		return "可以在水里游";
	}
	public String Price(){
		price = MOTOR_PRICE + STEAMER_PRICE + PLANE_PRICE ;
		return name+"的造价是"+price;
	}
}
