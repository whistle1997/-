package day10;
interface PlayGame{
	abstract void play(); // 默认修饰public 重写必须加
}
abstract class DianZi{
	abstract void Open();
	abstract void Close();
}
class phone extends DianZi implements PlayGame{
	void Open(){
		System.out.println("手机长按开机");
	}
	void Close(){
		System.out.println("手机长按关机");
	}
	public void play(){
		System.out.println("手机可以玩王者荣耀");
	}
}
class com extends DianZi implements PlayGame{
	void Open(){
		System.out.println("电脑点击电源键开机");
	}
	void Close(){
		System.out.println("开始菜单选择关机关机");
	}
	public void play(){
		System.out.println("电脑可以玩2K");
	}
}





public class Test {
	public static void main(String[] args) {
		DianZi p = new phone();
		p.Open();
		p.Close();
		//p.play():  父类DianZi没有play方法，编译报错
		phone m = (phone)p ;
		m.play();
		//(phone)p.play();    ?????
		PlayGame p1 = new phone();
		//p1.Open();  接口没有open方法
	}
}
