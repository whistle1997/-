package LianXi9;
/*����һ�������û��࣬Ҫ�������Ϣ���û�ID���û����롢email��ַ���ڽ������ʵ��ʱ��
������������Ϣ����Ϊ���캯���Ĳ������룬�����û�ID���û�����ʱ����ģ�
ȱʡ��email��ַ���û�ID�����ַ���"@gameschool.com" */
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
