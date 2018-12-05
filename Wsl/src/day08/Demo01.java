package day08;
class Person{
	private String name ;
	private int age ;
	public Person(){}
	public Person(String name , int age){
		this.name = name ;
		this.age = age;
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	public String info(){
		return "Ãû×Ö£º"+name+"ÄêÁä£º"+age ;
	}
	
}
class Student extends Person{
	private int id ;
	public Student(){}
	public Student(String name , int age ,int id){
		super(name , id);
		this.id = id ;
	}
	public int getId(){
		return id ;
	}
	@Override
	public String info(){
		return getName()+"..."+id+"...." ;
	}
	
}
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
