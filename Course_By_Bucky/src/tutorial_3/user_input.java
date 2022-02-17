package tutorial_3;

import java.util.Scanner;

public class user_input {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
	//	System.out.println(input.nextLine());
		
		System.out.println("What is your Name: ");
		
		String message = input.next();
		
		System.out.println(message);
		
	}

}
