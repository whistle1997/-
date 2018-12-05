
public class Manger {
	private String id ;
	private String passkey ;
	public Manger(String id , String passkey){
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
	public String toString() {
		// TODO Auto-generated method stub
		return "µÇÂ¼Ãû"+id;
	}
}
