package TwoLianXi7;

public class SuperVehicle implements Motor,Steamer , Plane{
	private String name ;
	private int price ;
	public SuperVehicle(String name) {
		super();
		this.name = name;
	}
	public String run(){
		return "�����ڵ�����";
	}
	public String fly(){
		return "���������Ϸ�";
	}
	public String sailing(){
		return "������ˮ����";
	}
	public String Price(){
		price = MOTOR_PRICE + STEAMER_PRICE + PLANE_PRICE ;
		return name+"�������"+price;
	}
}
