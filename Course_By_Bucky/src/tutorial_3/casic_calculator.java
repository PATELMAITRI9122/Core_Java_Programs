package tutorial_3;

import java.util.Scanner;

public class casic_calculator {

	Scanner input = new Scanner(System.in);

	double first_Number, second_Nuber, total;

	private void print() {
		
		System.out.println(" Enter the first Number: ");

		first_Number = input.nextDouble();

		System.out.println("Enter the second Number: ");

		second_Nuber = input.nextDouble();
	}

	private void addition() {

		total = first_Number + second_Nuber;
		
		System.out.println("Total of Addition is: " + total);
	}
	
	private void substration() {

		total = first_Number - second_Nuber;
		
		System.out.println("Total of substration is: " + total);
	}

	public static void main(String args[]) {

		casic_calculator object = new casic_calculator();
		object.print();
		object.addition();
		object.substration();
		
		System.out.println("Thank you!!!");
		

		
	}

}
