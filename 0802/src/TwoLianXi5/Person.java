package TwoLianXi5;
/*ѵ�����ܵ�
������ͳ��󷽷�
����˵��
�������кܶ����֣������й��ˡ������˵ȣ�������˵�����Ը�����ͬ��������ʲô���֣����Ƕ������࣬������ڼ̳й�ϵ��
ʵ�ֲ���
(1) ����һ�������� Person�����ԣ�name �� age
(2) �� Person ���ж���һ�����󷽷� say()
(3) ���� Chinese ��̳� Person
(4) ���� American ��̳� Person*/

abstract class Person {
	private String name ;
	private int age ;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	abstract void say();
}
