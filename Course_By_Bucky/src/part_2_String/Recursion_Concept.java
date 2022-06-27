package part_2_String;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Recursion_Concept {
	
	

	public static void main(String[] args) {
		
		// Method calling it's self -> Recursion
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input the number:  ");
		
		long number = input.nextLong();
		
		//fact(number);
		
		System.out.println(fact(number));
		
			

	}
	
	public static long fact(long n) {
		if(n <= 1)
			return 1;
		else
			return n * fact(n-1); //METHOD RECURSING
	}

}
