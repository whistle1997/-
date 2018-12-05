package Clock;

public class Clock {
	private int hour ;
	private int min ;
	private int sec ;
	public Clock(int hour, int min, int sec) {
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

	public void show(){
		System.out.println("当前时间为："+hour+"时"+min+"分"+sec+"秒");
	}
}

