package FixCar;

	/*	2����������
	���ԣ�		1�������֡�					2���е�ַ
	��Ϊ��		3�������������ķ���*/



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
