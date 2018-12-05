package LianXi3;
/*03.类的成员变量与方法、构造方法 
在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。 
定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），为了保证数据的安全性，
这三个成员变量应声明为私有。 为MyTime类定义构造方法，以方便创建对象时初始化成员变量。 再定义diaplay方法，用于将时间信息打印出来。
为MyTime类添加以下方法： 
addSecond(int sec)
 addMinute(int min) 
addHour(int hou)
 subSecond(int sec) 
subMinute(int min) 
subHour(int hou) 
分别对时、分、秒进行加减运算*/

public class MyTime {
	private int hour ;
	private int min ;
	private int sec ;
	public MyTime(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	/*addSecond(int sec)
	 addMinute(int min) 
	addHour(int hou)
	 subSecond(int sec) 
	subMinute(int min) 
	subHour(int hou) */
	public int addSecond(int sec){
		this.sec += sec ;
		return sec ;
	}
	public int addMinute(int min){
		this.min += min ;
		return min ;
	}
	public int addHour(int hou){
		hour += hou ;
		return hour ;
	}
	public int subSecond(int sec){
		this.sec -= sec ;
		return sec ;
	}
	public int subMinute(int min){
		this.min -= min ;
		return min ;
	}
	public int subHour(int hou){
		hour -= hou ;
		return hour ;
	}
	public void display(){
		System.out.println(hour+"时"+min+"分"+sec+"秒");
	}
}
