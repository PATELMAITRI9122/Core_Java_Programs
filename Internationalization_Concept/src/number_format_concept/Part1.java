package number_format_concept;

import java.text.NumberFormat;
import java.util.Locale;

public class Part1 {
	
	public static void main(String[] args) {
		
		// JAVA CODE -> ITALY SPECIFIC FORM
		
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.FRANCE);
		String s = nf.format(d);
		String s1 = nf1.format(d);
		System.out.println("ITALY SPECIFIC FORM: " +s);
		System.out.println("FRANCE SPECIFIC FORM: " +s1);
		
		
		Locale india = new Locale("hi","IN");
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(india);
		System.out.println(nf2.format(d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(nf3.format(d));
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf4.format(d));
	}

}
