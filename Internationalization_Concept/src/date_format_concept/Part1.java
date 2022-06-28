package date_format_concept;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Part1 {
	
	public static void main(String[] args) {
		
		//DATE FORMAT -> US FORMAT
		
		DateFormat ds = DateFormat.getDateInstance(0,Locale.US);
		
		System.out.println(ds.format(new Date()));
		
		DateFormat ds1 = DateFormat.getDateInstance(1,Locale.US);
		System.out.println(ds1.format(new Date()));
		
		DateFormat ds2 = DateFormat.getDateInstance(2,Locale.UK);
		System.out.println(ds2.format(new Date()));
		
		DateFormat ds3 = DateFormat.getDateInstance(3,Locale.UK);
		System.out.println(ds3.format(new Date()));
	}

}
