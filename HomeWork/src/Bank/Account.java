package Bank;

public class Account {
	private int id ;
	private int YuE;
	public Account(int id , int YuE ){
		this.id = id ;
		this.YuE = YuE;
		
	}
	
	
	public int Cun(int Cun){
		YuE += Cun ;
		return YuE;
	}
	public int Qu(int Qu){
		YuE -= Qu ;
		return YuE;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getYuE() {
		return YuE;
	}


	public void setYuE(int yuE) {
		YuE = yuE;
	}

}
