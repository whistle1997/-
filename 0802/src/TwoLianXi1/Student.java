package TwoLianXi1;
/*1��ʹ�÷�װʵ�ֽ�Ա���ѧ����
ѵ�����ܵ�
��װ
����˵����
��װ��Ա���ѧ���࣬���ԣ�name �� age
ʵ�ֲ���
(1) ���� Teacher �ࡣ
(2) ����˽�����ԡ�
(3) �������췽����
(4) ���� Getter/Setter ������
(5) ���� Student �ࡣ
(6) ����˽�����ԡ�
(7) �������췽����
(8) ���� Getter/Setter ������
(9) ��дһ�������ഴ��ѧ������Ա���󣬲���ӡ��*/

public class Student {
	private int age ;
	private String name ;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		System.out.println(name+ "-----" + age);
	}
}
