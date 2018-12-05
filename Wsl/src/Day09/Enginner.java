package Day09;

public class Enginner extends Worker {
	private int JiXiao ;
	public Enginner(int JiangJin,String name , int id){
		super(name ,id);
		this.JiXiao = JiangJin ;
		
	}
	public void work(){
		System.out.println(super.getName()+"是经理，工号"+super.getId()+"奖金为"+JiXiao);
	}
}

