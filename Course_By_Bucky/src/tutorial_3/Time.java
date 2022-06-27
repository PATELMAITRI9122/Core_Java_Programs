package tutorial_3;

public class Time {
	
	
	//private - accessible via method of only this class
	//public -accessible via everywhere meaning from this class and other class method as well
	//this - it is a refrence variable; refrencing the current class variable which is declare outside all the method look the example below in constructor
	

	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		
		//Using the global variable and this always refrence global variable
		this.hour = 4;
		this.minute = 5;
		this.second = 6;
	}
	
	public void setTime(int h, int m, int s) {
		
		hour = ((h>=0 && h<= 24) ? h : 0);
		minute = ((m>=0 && m<= 60) ? m:0);
		second = ((s>=0 && s<=60) ? s:0);
		
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12)? 12:hour%12), minute, second, (hour <12 ? "AM":"PM" ));
	}

}
