package DuoTai;
/*
 * ��̬��һ������߱�������̬��(������������ͱ�����ӿڵ�ָ��������Ķ���)
 * ǰ�᣺��������ڼ̳л�ʵ�ֹ�ϵ��
 * 
 * 	����   a = new  ��();     
 * 
 * Ҫע���ϸ�ڣ�
 * 	1����̬����£��Ӹ������ͬ���ĳ�Ա����ʱ�����ʵ��Ǹ����Ա��������̬�ͷǾ�̬��
 * 	2����̬����£��Ӹ������ͬ���ķǾ�̬�ĳ�Ա����ʱ�����ʵ�������ĳ�Ա����.
 * 	3����̬����£��Ӹ������ͬ���ľ�̬��Ա����ʱ�����ʵ��Ǹ���ĳ�Ա����
 * 	4����̬����£����ܷ���������еĳ�Ա.
 * �ܽ᣺��̬����£��Ӹ������ͬ����Աʱ�����ʵĸ���ĳ�Ա��ֻ����ͬ���ķǾ�̬����ʱ
 * 		���Ƿ��������
 * 
 * 
 * ��̬��Ӧ��
 * 	1����̬�����β����͵�ʱ�򣬿��Խ��ܸ��������
 * */
//������
abstract class Animal1{
	String name ;
	
	String color = "����ɫ";
	public Animal1(String name){
		this.name = name ;
	}
	abstract public void run();
}
//����
class Mouse extends Animal1{
	String color = "��ɫ" ;
	public Mouse(String name){
		super(name) ;
	}
	public void run(){
		System.out.println(name+"������������");
	}
}


//��
class Fish1 extends Animal1{
	public Fish1(String name){
		super(name);
	}
	public void run(){
		System.out.println(name+"ҡҡβ��������");
	}
}


public class DuoTai {
	public static void main(String[] args) {
		/*Mouse m = new Mouse("����");
		m.run();*/
		/*
		 * ��̬
		 * */
		Animal1 a = new Mouse("����"); //����Ҫһ�������һ������ûë��
		a.run();
	}
}
