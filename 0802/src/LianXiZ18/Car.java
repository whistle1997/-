package LianXiZ18;
/*����һ������Auto�࣬������̥������������ɫ�������������ٶȵȳ�Ա������
��ͨ����ͬ�Ĺ��췽������ʵ��������Ҫ��  �����ܹ����٣����٣�ͣ���� �ٶ���һ��С������Car��
�̳�Auto������ӿյ���CD�ȳ�Ա���������Ǽ��٣����ٵķ���  */
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
			System.out.println("��ȥ�޳�!!!!!");
		else
			System.out.println("����!!!!");
	}
	public void down(){
		if(super.getWheel() != 4)
			System.out.println("��ȥ�޳�!!!!");
		else
			System.out.println("����!!!!");
	}
	public void stop(){
		System.out.println("ͣ��!!!!!");
	}
}
