package Clock;
/*3、编写Java应用程序。
首先，定义一个时钟类——Clock，它包括三个int型
成员变量分别表示时、分、秒，一个构造方法用于对三个成员变量（时、分、秒）
进行初始化，还有一个成员方法show()用于显示时钟对象的时间。其次，再定义
一个主类——TestClass，在主类的main方法中创建多个时钟类的对象，使用这
些对象调用方法show()来显示时钟的时间。
*/
public class TestClass {
	public static void main(String[] args) {
		Clock c = new Clock(12 ,23 ,11);
		c.show();
	}
}
