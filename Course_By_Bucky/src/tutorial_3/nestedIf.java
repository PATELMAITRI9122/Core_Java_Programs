package tutorial_3;

import java.util.Scanner;

public class nestedIf {
	
	Scanner input = new Scanner(System.in);
	String message;
	
	
	public void print() {
		
		System.out.println("Hello!! Welcome to world of Java");
		System.out.println("Woud you please inform me your name? ");
		message = input.nextLine();
		System.out.printf("Thank youu   %s", message);
		
		detail();
		
	}
	
	public void detail() {
		
		System.out.println("What you want to learn: ");
		String reply = input.nextLine();
		
		if (reply.contentEquals("java")) {
			System.out.println("Thank you for choosing Java");
			System.out.println("Please let us know which concept of java you want to learn: ");
			
				String rr = input.nextLine();
			
			if (rr != null) {
				System.out.println("Thank you for letting us know.");
			}
		}else {
			System.out.println("Sorry we do not have availiable slot! see you in a next batch");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nestedIf object = new nestedIf();
		object.print();

	}

}
