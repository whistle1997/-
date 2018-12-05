package Day09;

abstract class Worker {
	private String name ;// ����
	private int id ;//����
	public Worker(String name , int id){
		this.name = name ;
		this.id = id ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	abstract void work();
}
