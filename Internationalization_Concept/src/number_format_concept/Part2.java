package number_format_concept;

import java.text.NumberFormat;

public class Part2 {
	
	public static void main(String[] args) {
		
		NumberFormat nf = NumberFormat.getInstance();
		
		nf.setMaximumFractionDigits(3);
		System.out.println(nf.format(123.4));
		System.out.println(nf.format(123.46678));
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(123.4));
		
		System.out.println("****");
		nf.setMinimumIntegerDigits(7);
		System.out.println(nf.format(1.234));
		nf.setMaximumIntegerDigits(5);
		System.out.println(nf.format(1.234));
	}

}
