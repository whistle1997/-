package JiCheng;

/*
 * ���⣺1���޷��������������ļ̳й�ϵ
 * 			�̳У��������ڶ���������
 * 			�̳еĸ�ʽ��class ����1 extends ����2{
 * 			
 * 			}
 * 			�̳���ͨ���ؼ���extends���ֵġ�
 * 			�̳�ע�����
 * 				1��ǧ��ҪΪ�˼����ظ������ȥ�̳У�ֻ����������
 * 					�̳й�ϵ�����ܼ̳С�
 * 				2������˽�еĳ�Ա���ܱ��̳�
 * 				3������Ĺ��캯�����ܱ��̳С�
 * 				4�������������ʱ��Ĭ�ϻ��ȵ��ø����޲εĹ��캯��
 * 					���ʣ�ΪʲôҪ���ø��๹�췽�������壺
 * 						���ø���Ĺ��췽���ǿ��Գ�ʼ���Ӹ���̳���ȥ������
 * 					���úͼ̳�֮��û�й�ϵ
 *	    2���������ظ����롣 
 *			
 * 
 * */
//����
class Person{//Student�ĸ��ࣨ���ࡢ���ࣩ
	String name ;
	private int age; //˽�˱��������ܼ̳�
	public Person(String name){
		this.name = name ;
	}
	public Person(){
		System.out.println("Person�Ĺ��캯����������");
	}
	public void eat(){
		System.out.println(name + "�ڳԷ�");
	}
}
//ѧ����
class Student extends Person {//Student ΪPerson������
	int num ;//ѧ��
	public Student(){
		System.out.println("Student�Ĺ��캯����������");
	}
	public void study(){
		System.out.println(name+"good good study , day day up");
		
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		/*s.name = "����";
	
		System.out.println("����:"+s.name);
		s.eat();*/
	}

}
