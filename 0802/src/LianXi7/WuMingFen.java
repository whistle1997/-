package LianXi7;
/*���췽�������� 
Ϊ�������ķۡ�дһ���ࣺclass WuMingFen Ҫ�� 
1.���������ԣ�����:String theMa  
�۵ķ���(��)��int quantity         
�Ƿ������boolean likeSoup 
2.дһ�����췽�����Ա��ڼ򻯳�ʼ�����̣��磺 
 WuMingFen f1 = new WuMingFen("ţ��",3,true); 
3.���ع��췽����ʹ�ó�ʼ�����̿��Զ�������
WuMingFen f2 = new WuMingFen("ţ��",2); 
4.���ʹ��������乹������ķ۶������������롢2���������ģ� 
 WuMingFen f3 = new WuMingFen(); 
5.дһ����ͨ������check()�����ڲ鿴���Ƿ����Ҫ�󡣼�����������������Դ�ӡ�ڿ���̨�ϡ�
*/
class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	String str ;
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	public WuMingFen(String theMa, int quantity) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
	}
	public WuMingFen() {
		
	}
	public String getTheMa() {
		return theMa;
	}
	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	public void check(){
		if(likeSoup)
			str = "����";
		else
			str = "������";	
		System.out.println(theMa+"���� "+quantity+"�� "+str);
	}
	
}
