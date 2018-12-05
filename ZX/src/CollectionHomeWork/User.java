package CollectionHomeWork;


public class User {
	private String id ;
	private String passkey ;
	public User(String id , String passkey){
		this.id = id ;
		this.passkey = passkey ;
	}
	public String getId() {
		return id;
	}
	public String getPasskey() {
		return passkey;
	}
	@Override
	public boolean equals(Object obj) {
		User u = (User)obj ;
		return u.id == u.id;
	}
}
