package date_time_api;

import java.time.LocalDateTime;

public class Demo2 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		int dd = ldt.getDayOfMonth();
		int mm = ldt.getMonthValue();
		int yy = ldt.getYear();
		
		System.out.printf("Date: %d-%d-%d", dd,mm,yy);
		
		int hh = ldt.getHour();
		int minute = ldt.getMinute();
		int ss = ldt.getSecond();
		int ns = ldt.getNano();
		
		System.out.printf("%nTime: %d:%d:%d:%d", hh,minute,ss,ns);
		
	}
}
