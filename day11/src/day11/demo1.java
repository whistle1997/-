package day11;

class Person{
	private String name ;
	private int age ;
	public Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { // ��дequals�������ﵽ�Ƚ����������Ƿ���ͬ������.
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(obj == null)
			return false;
		if(obj == this)
			return true;
		if(obj instanceof Person){
			Person p = (Person)obj;
			return (p.age == this.age) && (p.name == this.name);
		}else
			return false ;
	}
	@Override
	public String toString() {  // ��дtoString�������ﵽ�����Ҫ���ַ���Ч��
		// TODO Auto-generated method stub
		return "���������" + name + ",����"+ age + "��" ;
	}
}

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("����",18);
		Person p2 = new Person("����",21);
		System.out.println(p1.equals(p2));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getClass()); //��ӡ�����Ӧ����
		System.out.println(p1.hashCode()); // ��ӡ��ϣ��ֵ���˴�Ϊ10���ƣ�
		Object p = p2 ; // ���뿴��ߣ����е�ʱ���ǿ�������Ե��õ��ķ���.
		System.out.println(p.toString());
		//System.out.println("1".equals(1));
	}

}
