package LianXi2;
/*02.��ĳ�Ա������ 
�붨��һ����ͨ����(Vehicle)���࣬������: ���ԣ��ٶ�(speed)�����(size)�ȵ� 
�������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�. 
����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ������ͨ����ӡ������
���⣬���ü��٣����ٵķ������ٶȽ��иı䡣
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
	public void move(){//�ƶ�
		System.out.println("��������");
	}
	public int speedUp() {//����
		speed += 10 ;
		return speed ;
	}
	public int speedDown(){
		speed -= 10 ;
		return speed ;
	}
}
