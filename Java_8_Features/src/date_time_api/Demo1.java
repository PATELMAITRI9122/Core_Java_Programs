package date_time_api;

import java.time.LocalDate;
import java.time.LocalTime;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//System Current Date And Time
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//Customized Format
		System.out.println("Customized Format");
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d", dd,mm,yyyy);
		
		System.out.printf("\n%d/%d/%d", dd,mm,yyyy);
		
		System.out.println("\nCustomized Time");
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		
		System.out.printf("\n%d:%d:%d:%d", h,m,s,ns);
		
	}

}
