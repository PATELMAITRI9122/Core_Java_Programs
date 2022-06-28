package stringConcept;

import java.util.Scanner;

public class TrimConcept {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your city name: ");

		String cname = input.nextLine().toLowerCase().trim();

		if (cname.equalsIgnoreCase("surat")) {
			System.out.println("Hello From surat");
		} else if (cname.equals("rajkot"))
			System.out.println("Hello From Rajkot");
		else if (cname.equals("baroda"))
			System.out.println("Hello From Baroda");
		else {
			System.out.println("Please Enter Your city");
			// cname = input.nextLine();
		}
		
		String s = "Durga Soft";
		System.out.println(s.length());
		System.out.println(s.trim().length());

		/*
		 * 
		 * if (cname.equalsIgnoreCase("Surat")) {
		 * System.out.println("Hello From surat"); }else
		 * if(cname.equalsIgnoreCase("Rajkot")) System.out.println("Hello From Rajkot");
		 * else if(cname.equalsIgnoreCase("Baroda"))
		 * System.out.println("Hello From Baroda"); else {
		 * System.out.println("Please Enter Your city"); //cname = input.nextLine(); }
		 */

	}

}
