package Day09;

public class Enginner extends Worker {
	private int JiXiao ;
	public Enginner(int JiangJin,String name , int id){
		super(name ,id);
		this.JiXiao = JiangJin ;
		
	}
	public void work(){
		System.out.println(super.getName()+"�Ǿ�������"+super.getId()+"����Ϊ"+JiXiao);
	}
}

