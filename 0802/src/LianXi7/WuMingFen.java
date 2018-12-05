package LianXi7;
/*构造方法与重载 
为“无名的粉”写一个类：class WuMingFen 要求： 
1.有三个属性：面码:String theMa  
粉的分量(两)：int quantity         
是否带汤：boolean likeSoup 
2.写一个构造方法，以便于简化初始化过程，如： 
 WuMingFen f1 = new WuMingFen("牛肉",3,true); 
3.重载构造方法，使得初始化过程可以多样化：
WuMingFen f2 = new WuMingFen("牛肉",2); 
4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的？ 
 WuMingFen f3 = new WuMingFen(); 
5.写一个普通方法：check()，用于查看粉是否符合要求。即：将对象的三个属性打印在控制台上。
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
			str = "带汤";
		else
			str = "不带汤";	
		System.out.println(theMa+"面码 "+quantity+"两 "+str);
	}
	
}
