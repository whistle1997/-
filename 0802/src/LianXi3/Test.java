package LianXi3;

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
	}

}
