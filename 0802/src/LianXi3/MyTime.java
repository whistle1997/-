package LianXi3;
/*03.��ĳ�Ա�����뷽�������췽�� 
�ڳ����У�����Ҫ��ʱ����в��������ǲ�û��ʱ�����͵����ݡ���ô�����ǿ����Լ�ʵ��һ��ʱ���࣬����������е���Ҫ�� 
������ΪMyTime���࣬����Ӧ���������ͳ�Ա��ʱ��hour�����֣�minute�����루second����Ϊ�˱�֤���ݵİ�ȫ�ԣ�
��������Ա����Ӧ����Ϊ˽�С� ΪMyTime�ඨ�幹�췽�����Է��㴴������ʱ��ʼ����Ա������ �ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ������
ΪMyTime��������·����� 
addSecond(int sec)
 addMinute(int min) 
addHour(int hou)
 subSecond(int sec) 
subMinute(int min) 
subHour(int hou) 
�ֱ��ʱ���֡�����мӼ�����*/

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
		System.out.println(hour+"ʱ"+min+"��"+sec+"��");
	}
}
