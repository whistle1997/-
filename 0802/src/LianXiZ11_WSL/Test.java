package LianXiZ11_WSL;

public class Test {

	public static void main(String[] args) {
		MyTime t = new MyTime(12,12,12) ;
		
		//����ʱ����
		t.addHour(12);
		//System.out.println(t.addHour(12));
		t.addMinute(12);
		t.addSecond(12);
		t.display();
		//����ʱ�䲢��ʾ
		t.subHour(12);
		t.subMinute(12);
		t.subSecond(12);
		t.display();
		//����ʱ�䲢��ʾ
		System.out.println();
		
		
		MyTime t1 = new MyTime() ;
		t1.setHour(12);
		t1.setMin(12);
		t1.setSec(12);
		//����ʱ����
		t1.addHour(12);
		//System.out.println(t.addHour(12));
		t1.addMinute(12);
		t1.addSecond(12);
		t1.display();
		//����ʱ�䲢��ʾ
		t1.subHour(12);
		t1.subMinute(12);
		t1.subSecond(12);
		t1.display();
	}

}
