package LianXi2;
/*��д����Frock�ࡣ
�����ߴ�size����ɫcolor���۸�price������ ������,��Ӧ���Ե�get/set����

��Frock��������˽�еľ�̬����currentNum����ʼֵΪ100000����Ϊ�·����������к���ʼֵ��
�������еľ�̬����getNextNum����Ϊ��������Ψһ���кŵķ�����ÿ����һ�Σ���currentNum����100������Ϊ����ֵ��*/
public class Frock {
	private String size ;
	private String color ;
	private int price ;
	private static int currentNum = 100000 ;
	public Frock(){}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getNextNum(){
		currentNum += 100;
		return currentNum;
	}
}
