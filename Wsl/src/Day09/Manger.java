package Day09;

public class Manger extends Worker {
	private int JiangJin ;
	public Manger(int JiangJin,String name , int id){
		super(name ,id);
		this.JiangJin = JiangJin ;
		
	}
	public void work(){
		System.out.println(super.getName()+"�Ǿ�������"+super.getId()+"����Ϊ"+JiangJin);
	}
}
