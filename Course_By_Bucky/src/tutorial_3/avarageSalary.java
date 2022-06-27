package tutorial_3;

import java.util.Scanner;

public class avarageSalary {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int counter = 0;
		int grade, ave;
		
		System.out.println("Please enter 10 number you want to have average: ");
		
		for(counter = 6; counter <=21; counter++) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		
//		while(counter <10) {
//			grade = input.nextInt();
//			total = total + grade;
//			counter++;
//			
//		}
		
		ave = total /10;
		
		System.out.println("Your average is: " + ave);

	}

}

