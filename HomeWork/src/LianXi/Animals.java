package LianXi;
//4�����һ�������࣬����������Ļ������ԡ��������ơ���С�������ȣ��������Ӧ�Ķ����������ܡ������ߵȡ�
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
		System.out.println(name+"�ܵĺܿ�");
	}
	public void jump(){
		System.out.println(name+"���ø�");
	}
	public void walk(){
		System.out.println(name+"������");
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