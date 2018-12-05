package People;
/*5、按要求编写Java应用程序。
（1）创建一个叫做People的类：
属性：姓名、年龄、性别、身高
行为：说话、计算加法、改名
编写能为所有属性赋值的构造方法；
（2）创建测试类：
创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
让该对象调用成员方法：
说出“你好！”
计算23+45的值
将名字改为“李四”*/

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
		System.out.println("你好！");
	}
	public int sum(){
		return 23+45 ;
	}
	public String changeName(){
		name = "李四";
		return name;
	}
}
