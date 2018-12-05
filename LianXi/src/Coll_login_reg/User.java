package Coll_login_reg;

public class User {
	private String id ;
	private String passkey ;
	public User(String id , String passkey){
		this.id = id ;
		this.passkey = passkey;
	}
	public String getId(){
		return id;
	}
	public String getPasskey(){
		return passkey ;
	}
	/*	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		User use = (User)obj ;
		return this.getId() == use.getId();
	}*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "=====" + passkey;
	}
}
