package LianXi8;
/*���췽�������أ� 
����һ����ΪVehicles����ͨ���ߣ��Ļ��࣬������Ӧ����String���͵ĳ�Ա����brand���̱꣩��color����ɫ����
��Ӧ������Ա����run����ʻ���ڿ���̨��ʾ�����Ѿ������ˡ�����showInfo����ʾ��Ϣ���ڿ���̨��ʾ�̱����ɫ��������д���췽����ʼ�����Ա���ԡ� 
��дCar��С��������̳���Vehicles�࣬����int�ͳ�Ա����seats����λ����
��Ӧ���ӳ�Ա����showCar���ڿ���̨��ʾС��������Ϣ��������д���췽���� ��дTruck����������̳���Vehicles�࣬����float�ͳ�Ա����load�����أ�����Ӧ���ӳ�Ա����showTruck���ڿ���̨��ʾ��������Ϣ��������д���췽���� ��main�����в������ϸ��ࡣ
*/
public class Vihicles {
	private String brand;
	private String color ;
	public Vihicles(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	public void run(){
		System.out.println("���Ѿ�������");
	}
	public void showInfo(){
		System.out.println(brand+"---"+color);
	}
}
