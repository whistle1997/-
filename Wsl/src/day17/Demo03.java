package day17;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用枚举值
		Sex nan = Sex.male; //调用了male对象
		nan.function();//调用male对象的function方法
		System.out.println(nan.name);
		nan.show();
		System.out.println();
		Sex nv = Sex.famale;
		nv.function(); // famale的function
		System.out.println(nv.name); //成员变量不共享
	}

}

enum Sex{
	male("狗娃"){
		public void function(){
			System.out.println("男");
		}
	}, famale{
		public void function(){
			System.out.println("女");
		}
	};  //枚举类有两个枚举值，只可以创建两个对象
	//等同于
	private Sex(){}
	//public static Sex male = new male();
	//可创建成员变量
	String name;
	//成员方法
	public void show(){
		System.out.println("这是一个枚举类");
	}
	//构造方法
	//无参和有参均可,默认调用无参
	private Sex(String name){
		this.name= name ;
	}
	//抽象方法,需要被枚举值重写
	public abstract void function();
}