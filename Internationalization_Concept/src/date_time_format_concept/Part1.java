package date_time_format_concept;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Part1 {
	
	public static void main(String[] args) {
		
		DateFormat us = DateFormat.getDateTimeInstance(3,3,Locale.US);
		System.out.println(us.format(new Date()));
	}

}
