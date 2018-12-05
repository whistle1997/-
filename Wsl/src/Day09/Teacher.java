package Day09;

public class Teacher extends People{
	private int id ;
	public Teacher(String name , int age , int id){
		super(age , name);
		this.id = id ;
	}
	public int getId() {
		return id;
	}
	public String getInfo(){
		return super.getName()+"是老师"+super.getAge()+"岁,工号是"+id ;
	}
}
