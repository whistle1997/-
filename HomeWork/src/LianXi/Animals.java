package LianXi;
//4、设计一个动物类，它包含动物的基本属性。例如名称、大小、重量等，并设计相应的动作，例如跑、跳、走等。
public class Animals {
	private String name ;
	private String big ;
	private int weight ;
	public Animals(String name, String big, int weight) {
		this.name = name;
		this.big = big;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBig() {
		return big;
	}

	public void setBig(String big) {
		this.big = big;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void run(){
		System.out.println(name+"跑的很快");
	}
	public void jump(){
		System.out.println(name+"跳得高");
	}
	public void walk(){
		System.out.println(name+"慢慢走");
	}
}
class dog extends Animals{
	public dog(String name , String big , int weight){
		super(name ,big ,weight);
		
	}
}
class cat extends Animals{
	public cat(String name , String big , int weight){
		super(name ,big ,weight);
		
	}
}