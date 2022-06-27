package tutorial_3;

public class MultipleConstructor {

	private int hour;
	private int minute;
	private int second;
	
	public MultipleConstructor() {
		this(0,0,0);
	}

	public MultipleConstructor(int h) {
		// TODO Auto-generated constructor stub
		this(h,0,0);
	}

	public MultipleConstructor(int h, int m) {
		// TODO Auto-generated constructor stub
		this(h,m,0);
	}

	public MultipleConstructor(int h, int m, int s) {
		// TODO Auto-generated constructor stub
		setTime(h,m,s);
	}
	
	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setSecond(int s) {
		// TODO Auto-generated method stub
		
		second = ((s>=0 && s<60) ? s:0);
		
	}

	public void setMinute(int m) {
		// TODO Auto-generated method stub
		
		minute = ((m>=0 && m<60) ? m:0);
		
	}

	public void setHour(int h) {
		// TODO Auto-generated method stub
		
		hour = ((h>=0 && h<24) ? h:0);
		
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String miliatary() {
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
	
	
}
