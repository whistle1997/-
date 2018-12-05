package Day09;

public class Student extends People{
	private int id ;
	public Student(String name , int age , int id){
		super(age , name);
		this.id = id ;
	}
	public int getId() {
		return id;
	}
	public String getInfo(){
		return super.getName()+"是学生"+super.getAge()+"岁,学号是"+id ;
	}
}
