package date_format_concept;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Part2 {
	
	public static void main(String[] args) {
		
		DateFormat uk = DateFormat.getDateInstance(0,Locale.UK);
		DateFormat us = DateFormat.getDateInstance(0,Locale.US);
		DateFormat italy = DateFormat.getDateInstance(0,Locale.ITALY);
		
		
		
		System.out.println(uk.format(new Date()));
		System.out.println(us.format(new Date()));
		System.out.println(italy.format(new Date()));
	}

}
