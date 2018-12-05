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
	public boolean equals(Object obj) { // 重写equals方法，达到比较名字年龄是否相同的问题.
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
	public String toString() {  // 重写toString方法，达到输出想要的字符的效果
		// TODO Auto-generated method stub
		return "这个人名叫" + name + ",今年"+ age + "岁" ;
	}
}

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("狗蛋",18);
		Person p2 = new Person("狗娃",21);
		System.out.println(p1.equals(p2));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getClass()); //打印对象对应的类
		System.out.println(p1.hashCode()); // 打印哈希码值（此处为10进制）
		Object p = p2 ; // 编译看左边，运行的时候还是看对象可以调用到的方法.
		System.out.println(p.toString());
		//System.out.println("1".equals(1));
	}

}
