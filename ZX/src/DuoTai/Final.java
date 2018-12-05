package DuoTai;
/*
 * final(最终的   修饰符)
 * 	final的用法：
 * 		1、final修饰一个基本类型的变量时，该变量不能重新赋值
 * 			该值第一次的值为最终的。
 * 		2、final关键字修饰一个应用类型变量时，该变量不能重新指向新的对象
 * 		3、final修饰一个函数的时候，该函数不能被重写
 * 		4、修饰一个类的时候，该类不能被继承
 * 常量的修饰符一般为  public static final.
 * 	原因：
 * 
 * */
class Ciecle{
	double r;
	final double pi = 3.14 ; // 最终的变量,固定不变
	public Ciecle(double r){
		this.r=r ;
	}
	public void getArea(){
		System.out.println("圆形的面积是:"+r*r*pi);
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ciecle c = new Ciecle(4.0);
		c = new Ciecle(5.0);//c变量指向一个新的对象,final Ciecle c 此时c不能指向新的对象
		
		
	}

}
