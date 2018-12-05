
public class VIP extends Customer{
	private String VIP;

	public VIP(int id ,String name, int age, String sex, String VIP) {
		super(id ,name, age, sex);
		this.VIP = VIP;
	}
	
	public String getVIP() {
		return VIP;
	}

	public void setVIP(String vIP) {
		VIP = vIP;
	}
	public String getInf0(){
		return "\t\t"+getId()+"\t"+getName() + "\t" + getAge() + "\t" + getSex() + "\t" +VIP + "VIP";
	}
}
