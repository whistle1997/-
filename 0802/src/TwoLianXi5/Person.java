package TwoLianXi5;
/*训练技能点
抽象类和抽象方法
需求说明
世界上有很多人种，例如中国人、美国人等，他们所说的语言各不相同。不管是什么人种，他们都是人类，这里存在继承关系。
实现步骤
(1) 创建一个抽象类 Person，属性：name 和 age
(2) 在 Person 类中定义一个抽象方法 say()
(3) 创建 Chinese 类继承 Person
(4) 创建 American 类继承 Person*/

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
