//客户对象，记录客户数据
public class Customer {
	private int id ;
	private String name ;
	private int age ;
	private String sex ;
	public Customer(){}
	//private int i = 0;
	public Customer(int id ,String name , int age , String sex){
		this.id = id ;
		this.name = name ;
		this.age = age ;
		this.sex = sex ;
	}
	public int getId(){
		return id ;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	public String getSex(){
		return sex ;
	}
	public String getInf0(){
		return "\t\t"+id+"\t"+name + "\t" + age + "\t" + sex ;
	}
}
