package LianXi;
//6、创建一个People类，定义成员变量如编号、姓名、性别、年龄；定义成员方法“获得编号”、“获得姓名”、“获得年龄”等，再创建People类的对象。
public class People {
	private int id ;
	private String name ;
	private String sex ;
	private int age ;
	public int getId() {
		return id;
	}
	public void setId(int id) { //获得编号
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {//获得姓名
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {//获得性别
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//获得年龄
		this.age = age;
	}
	
}
