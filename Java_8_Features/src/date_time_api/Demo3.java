package date_time_api;

import java.time.LocalDateTime;
import java.time.Month;

public class Demo3 {
	
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.of(1997, Month.OCTOBER,27,12,45);
		System.out.println(ldt);
		
		System.out.println("After Six Month: " + ldt.plusMonths(6));
		System.out.println("Before Six Month: " + ldt.minusMonths(6));
		
	}

}
