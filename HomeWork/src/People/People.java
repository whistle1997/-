package People;
/*5����Ҫ���дJavaӦ�ó���
��1������һ������People���ࣺ
���ԣ����������䡢�Ա����
��Ϊ��˵��������ӷ�������
��д��Ϊ�������Ը�ֵ�Ĺ��췽����
��2�����������ࣺ
����һ���������С����������Ա��С�������18�꣬���1.80��
�øö�����ó�Ա������
˵������ã���
����23+45��ֵ
�����ָ�Ϊ�����ġ�*/

class People {
	private String name ;
	private int age ;
	private String sex ;
	private int height ;
	public People(String name, int age, String sex, int height) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void talk(){
		System.out.println("��ã�");
	}
	public int sum(){
		return 23+45 ;
	}
	public String changeName(){
		name = "����";
		return name;
	}
}
