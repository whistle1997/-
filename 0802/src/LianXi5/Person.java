package LianXi5;
/*���췽���� 
��дJava����������ʾ�˵����������䡣 ����һ�����ࣨPerson����������Ӧ��������˽�����ԣ�
������name�������䣨age�������幹�췽����������ʼ�����ݳ�Ա���ٶ�����ʾ��display���������������������ӡ������
*/
class Person {
	private String name ;
	private int age ;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void display(){
		System.out.println(name+"-----"+age);
	}
}
