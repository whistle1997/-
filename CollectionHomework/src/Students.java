
public class Students {
	private String name ;
	private int id ;
	private String sex ;
	public Students(){}
	public Students(String name , int id , String sex){
		this.name = name ;
		this.id = id ;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getSex() {
		return sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ѧ�ţ�"+id+" "+"����:"+name+" "+"�Ա�:"+sex;
	}
	public String getInfo(){
		return id + "\t" + name ;
	}
}
