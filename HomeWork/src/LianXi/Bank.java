package LianXi;


/*3����д����ģ�������˻����ܡ�Ҫ�����¡�
���ԡ��˺š�������������ַ���������С����������ȡ���ѯ�������û�������ʾ���������Ϣ�����������
��ʾ����ԭ�������մ��������մ����ȡ��ʱ����������С����С���ܾ��տ����ʾ�����ٱ������XXX�� */

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
		System.out.println("ԭ����"+YuE);
		System.out.println("���մ����:"+x);
		YuE += x;
		System.out.println("���ɹ��������Ϊ��"+YuE);
	}
	public void Qu(int x){
		System.out.println("ԭ����"+YuE);
		System.out.println("����ȡ����:"+x);
		YuE -= x ;
		if(YuE < min){
			System.out.println("�����ٱ������"+min+"Ԫ");
			YuE += x ;
		}
		else
			System.out.println("ȡ��ɹ��������Ϊ"+YuE);
	}
	public void Cha(){
		System.out.println("����ǰ���Ϊ��"+YuE);
	}
}
