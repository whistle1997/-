package LianXi2;
/*02.��ĳ�Ա������ 
�붨��һ����ͨ����(Vehicle)���࣬������: ���ԣ��ٶ�(speed)�����(size)�ȵ� 
�������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�. 
����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ��
����ͨ����ӡ���������⣬���ü��٣����ٵķ������ٶȽ��иı䡣
*/
public class Test {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setSize("XXXL");
		v.setSpeed(100);
		v.move();
		int speed1 = v.speedUp();
		int speed2= v.speedDown();
		System.out.println("һ������"+speed1+"��");
		System.out.println("һ��ɲ��"+speed2+"��");
	}

}
