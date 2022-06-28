package supplier_concept;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Concept1 {
	
	public static void main(String[] args) {
		
		
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
		// Supllier for Random OTP
		//For Random min -> 0 and max -> 0.999....
		
		Supplier<String> s1 = () -> {
			String otp = "";
			for(int i = 0; i<=5; i++) {
				otp = otp + (int)(Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s1.get());
	}

}
