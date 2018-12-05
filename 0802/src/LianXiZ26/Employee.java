package LianXiZ26;

class Employee extends Role{
	int salary;
	static int id  = 23243;
	public Employee(int x, int salary) {
		super(x);
		this.salary = salary;
	}
	public Employee() {
		super();
		salary = 1000 ;
		super.setX(28);
	}
	void play(){
		System.out.println(salary+"-----"+id);
	}
	final void sing(){
		System.out.println("×îºóÒ»Çú");
	}
}
