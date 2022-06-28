package date_time_api;

import java.time.Year;
import java.util.Scanner;

public class Demo5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Number: ");
		int year = input.nextInt();
		
		Year y = Year.of(year);
		
		if(y.isLeap()) {
			System.out.printf("%d is Leap Year",year);
		}else
			System.out.printf("%d is not leap year",year);
		
	}

}
