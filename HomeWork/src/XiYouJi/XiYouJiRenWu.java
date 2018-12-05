package XiYouJi;

public class XiYouJiRenWu {
	private int height;
	private String name ;
	private String weapon ;
	public XiYouJiRenWu(int height ,String name , String weapon){
		this.height =height ;
		this.name = name ;
		this.weapon = weapon ;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void printName(){
		System.out.println("角色名字为："+name);
	}
	public void printWeapon(){
		System.out.println("武器名字为:"+weapon);
	}
}
