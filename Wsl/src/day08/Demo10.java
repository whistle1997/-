package day08;
/*
 * ��ǰ���⣺����Ĺ����޷�������������
 *	
 *��������д���Ӹ��������ͬ���ĺ���
 *ʲôʱ���ã�����Ĺ����޷��������������
 *���������أ�
 *	��һ�����д�����������������ͬ������
 *��д��
 *	�����и���
 * 	Ҫע�⣺
 * 		1�����������β��б����һ��
 * 		2������Ȩ��ҪС�ڵ�������Ȩ��
 * 		3�����෵��ֵ����С�ڵ��ڸ��෵��ֵ����
 * 		4�������׳��쳣����С�ڵ��ڸ����׳����쳣����
 * */
class Fu1{
	String name ;
	public Fu1(String name){
		this.name = name;
	}
	public void eat(){
		System.out.println(name+"�Է���");
	}
}
class Zi1 extends Fu1{
	String num ;
	public Zi1(String name){
		super(name);
	}
	//��������д
	public void eat(){
		System.out.println("��KFC");
	}
}
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi1 z = new Zi1("����");
		z.eat();
	}

}
