package LianXi9;
/*定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。在建立类的实例时，
把以上三个信息都作为构造函数的参数输入，其中用户ID和用户密码时必须的，
缺省的email地址是用户ID加上字符串"@gameschool.com" */
public class Web {
	private String id;
	private String password ;
	private String email ;
	public Web(String id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public Web(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public void print(){
		System.out.println(id+"------"+ password +"------"+email+"@gameschool.com");
	}
}
