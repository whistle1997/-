package LianXiZ22;

public class Bike implements Vehicle{
	private String name ;
	public void Start(String name){
		this.name = name ;
		System.out.println(name+"�����г�,������");
	}
	public void Stop(String name){
		this.name = name ;
		System.out.println(name+"�����г�,ͣ��");
	}
}
