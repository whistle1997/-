package LianXi3;

public class Test {

	public static void main(String[] args) {
		MyTime t = new MyTime(12,12,12) ;
		
		//设置时分秒
		t.addHour(12);
		//System.out.println(t.addHour(12));
		t.addMinute(12);
		t.addSecond(12);
		t.display();
		//增加时间并显示
		t.subHour(12);
		t.subMinute(12);
		t.subSecond(12);
		t.display();
		//减少时间并显示
	}

}
