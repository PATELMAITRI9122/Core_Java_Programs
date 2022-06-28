package date_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo6 {
	
	
	
	public static void main(String[] args) {
		char end = 5;
		int start = 1;
		
		System.out.println(end + start);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}

}
