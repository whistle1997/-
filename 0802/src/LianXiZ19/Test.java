package LianXiZ19;
/*设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”类。使用继承将这些图形分类，
找出能作为基类部分的共同特征(如校准点)和方法(如画法、初始化)，并看看这些图形是否能进一步划分为子类。 
本题只考虑实现思想，不考虑具体实现的细节，实现方式可自由发挥。*/

class Shape {
	int bian ;
	public Shape(int bian){
		this.bian = bian ;
	}
}
class JuXing extends Shape{
	int n ;
	public JuXing(int bian , int n){
		super(bian);
		System.out.println("矩形有"+n+"条边，边长为"+bian);
	}
}
class SanJiao extends Shape{
	int n ;
	public SanJiao(int bian , int n){
		super(bian);
		System.out.println("三角形有"+n+"条边，边长为"+bian);
	}
}
class circle extends Shape{
	public static final double PI = 3.14 ;
	public circle(int bian){
		super(bian);
		System.out.println("圆形有半径，长"+bian+"面积是"+(PI*bian*bian));
	}
}
class Test{
	public static void main(String[] args) {
		JuXing j = new JuXing(23, 4);
		SanJiao s = new SanJiao(4, 3);
		circle c = new circle(5);
	}
}