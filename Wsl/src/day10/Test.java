package day10;
interface PlayGame{
	abstract void play(); // Ĭ������public ��д�����
}
abstract class DianZi{
	abstract void Open();
	abstract void Close();
}
class phone extends DianZi implements PlayGame{
	void Open(){
		System.out.println("�ֻ���������");
	}
	void Close(){
		System.out.println("�ֻ������ػ�");
	}
	public void play(){
		System.out.println("�ֻ�������������ҫ");
	}
}
class com extends DianZi implements PlayGame{
	void Open(){
		System.out.println("���Ե����Դ������");
	}
	void Close(){
		System.out.println("��ʼ�˵�ѡ��ػ��ػ�");
	}
	public void play(){
		System.out.println("���Կ�����2K");
	}
}





public class Test {
	public static void main(String[] args) {
		DianZi p = new phone();
		p.Open();
		p.Close();
		//p.play():  ����DianZiû��play���������뱨��
		phone m = (phone)p ;
		m.play();
		//(phone)p.play();    ?????
		PlayGame p1 = new phone();
		//p1.Open();  �ӿ�û��open����
	}
}
