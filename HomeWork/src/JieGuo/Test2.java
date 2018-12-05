package JieGuo;
/*结果为：
 * 	静态代码块Fu
		静态代码块Zi
		构造代码块Fu
		构造方法Fu
		构造代码块Zi
		构造方法Zi
		
		原因：主方法创建Zi类对象，Zi类继承Fu类，所以将Zi与Fu中的静态代码块有限加载到方法区的静态区域执行，Zi类构造方法
		第一行隐藏了super();,构造代码块又先于构造方法执行，所以先执行Fu中的构造代码块、构造方法，在执行Zi类的构造代码块、构造方法
 * */

class Fu {
	static {
		System.out.println("静态代码块Fu");
	}

	{
		System.out.println("构造代码块Fu");
	}

	public Fu() {
		System.out.println("构造方法Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("静态代码块Zi");
	}

	{
		System.out.println("构造代码块Zi");
	}

	public Zi() {
		System.out.println("构造方法Zi");
	}
}

       class Test2{

       public static void main(String[] args){
Zi z = new Zi(); //请写出执行结果。
           }


       }
       
     