package LianXiZ22;

public class Bus implements Vehicle{
	private String name ;
	public void Start(String name){
		this.name = name ;
		System.out.println(name+"是公交车,启动了");
	}
	public void Stop(String name){
		this.name = name ;
		System.out.println(name+"是公交车,停了");
	}
}