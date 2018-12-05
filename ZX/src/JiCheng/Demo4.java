package JiCheng;



class Fu{
	int x = 10 ;
	String name ;
	public Fu(String name){
		this.name = name ;
		System.out.println("这是父类有参的构造方法");
	}
	public Fu(){
		System.out.println("这是父类无参的构造方法");
	}
}
class Zi extends Fu{
	int x = 20 ;
	public Zi(String name){
		super(name);//指定调用父类一个参数的构造函数。
	}
	public void print(){
		System.out.println("x = "+x);
		System.out.println("x2 = "+ super.x);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi("大头儿子");//此时对象中有两个x，堆内存中开辟空间
						//空间中一部分用于保存继承下来的x，专门用于存储继承下来的属性数据
		
		//z.print();//就近原则
		System.out.println("name="+z.name);
		
	}

}
