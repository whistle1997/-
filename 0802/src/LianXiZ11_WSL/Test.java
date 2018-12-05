package LianXiZ11_WSL;

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
		System.out.println();
		
		
		MyTime t1 = new MyTime() ;
		t1.setHour(12);
		t1.setMin(12);
		t1.setSec(12);
		//设置时分秒
		t1.addHour(12);
		//System.out.println(t.addHour(12));
		t1.addMinute(12);
		t1.addSecond(12);
		t1.display();
		//增加时间并显示
		t1.subHour(12);
		t1.subMinute(12);
		t1.subSecond(12);
		t1.display();
	}

}
