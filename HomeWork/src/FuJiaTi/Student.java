package FuJiaTi;
/*1������һ����ʾѧ����Ϣ����Student��Ҫ�����£�
��1����Student�ĳ�Ա������
sNO����ʾѧ�ţ�sName��ʾ������sSex��ʾ�Ա�sAge��ʾ���䣻sJava����ʾJava�γ̳ɼ���
��2����Student�������Ĺ��췽���� 
�ڹ��췽����ͨ���β���ɶԳ�Ա�����ĸ�ֵ������
��3����Student�ķ�����Ա��
getNo���������ѧ�ţ� 
getName��������������� 
getSex����������Ա�
getAge����������䣻
getJava���������Java �γ̳ɼ�
������Student�Ķ��壬�����������Ķ������ÿ��ѧ������Ϣ�����㲢��������ѧ��Java���Գɼ���ƽ��ֵ���Լ����㲢�������Java���Գɼ������ֵ����Сֵ��*/
public class Student {
	private int sNO;
	private String sName ;
	private String sSex ;
	private int sAge ;
	private int sJava;
	public Student(int sNO, String sName, String sSex, int sAge, int sJava) {
		super();
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public int getsNO() {
		return sNO;
	}
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public int getsJava() {
		return sJava;
	}
	public void setsJava(int sJava) {
		this.sJava = sJava;
	}
	
	
}
