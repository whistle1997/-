package LianXiZ11_WSL;
/*.���췽�������� 
���ϴ���ϰ�����б�д��MyTime������Լ����ֵ�ƴ�������İ��У���Ϊ��������һ�鹹�췽�����Է���ʹ�����ܹ��Զ�����ʽ��ʼ�������ʵ���� 
*/

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
	public MyTime(){
		
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
