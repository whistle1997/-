package LianXi;


/*3、编写程序，模拟银行账户功能。要求如下、
属性、账号、储户姓名、地址、存款余额、最小余额。方法、存款、取款、查询。根据用户操作显示储户相关信息。如存款操作后，
显示储户原有余额、今日存款数额及最终存款余额；取款时，若最后余额小于最小余额，拒绝收款，并显示“至少保留余额XXX” */

public class Bank {
	private int id ;
	private String name ;
	private String add ;
	private int YuE;
	private int min ;
	public Bank(int id, String name, String add, int yuE, int min) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		YuE = yuE;
		this.min = min;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getYuE() {
		return YuE;
	}
	public void setYuE(int yuE) {
		YuE = yuE;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void Cun(int x){
		System.out.println("原有余额："+YuE);
		System.out.println("今日存款金额:"+x);
		YuE += x;
		System.out.println("存款成功最终余额为："+YuE);
	}
	public void Qu(int x){
		System.out.println("原有余额："+YuE);
		System.out.println("今日取款金额:"+x);
		YuE -= x ;
		if(YuE < min){
			System.out.println("请至少保留余额"+min+"元");
			YuE += x ;
		}
		else
			System.out.println("取款成功最终余额为"+YuE);
	}
	public void Cha(){
		System.out.println("您当前余额为："+YuE);
	}
}
