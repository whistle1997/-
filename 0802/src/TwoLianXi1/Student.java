package TwoLianXi1;
/*1：使用封装实现教员类和学生类
训练技能点
封装
需求说明：
封装教员类和学生类，属性：name 和 age
实现步骤
(1) 创建 Teacher 类。
(2) 定义私有属性。
(3) 创建构造方法。
(4) 生成 Getter/Setter 方法。
(5) 创建 Student 类。
(6) 定义私有属性。
(7) 创建构造方法。
(8) 生成 Getter/Setter 方法。
(9) 编写一个测试类创建学生、教员对象，并打印。*/

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
