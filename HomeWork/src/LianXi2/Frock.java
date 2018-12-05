package LianXi2;
/*编写上衣Frock类。
包含尺寸size、颜色color、价格price等属性 构造器,对应属性的get/set方法

在Frock类中声明私有的静态属性currentNum，初始值为100000，作为衣服出厂的序列号起始值。
声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum增加100，并作为返回值。*/
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
