package Day09;

public class Manger extends Worker {
	private int JiangJin ;
	public Manger(int JiangJin,String name , int id){
		super(name ,id);
		this.JiangJin = JiangJin ;
		
	}
	public void work(){
		System.out.println(super.getName()+"是经理，工号"+super.getId()+"奖金为"+JiangJin);
	}
}
