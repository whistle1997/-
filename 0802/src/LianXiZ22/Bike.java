package LianXiZ22;

public class Bike implements Vehicle{
	private String name ;
	public void Start(String name){
		this.name = name ;
		System.out.println(name+"是自行车,启动了");
	}
	public void Stop(String name){
		this.name = name ;
		System.out.println(name+"是自行车,停了");
	}
}
