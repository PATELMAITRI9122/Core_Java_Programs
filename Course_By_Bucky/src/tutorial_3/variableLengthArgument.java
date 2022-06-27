package tutorial_3;

import java.util.Scanner;

public class variableLengthArgument {

	public static int avaerage(int...number) {
		int total = 0;
		int average = 0;
		
		for(int x : number) {
			total+=x;
			
		}
		
		average = total/number.length;
		
		return average;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter the number to count the average: ");
//		
//		int keyNumber = input.nextInt();
		
		System.out.println("The average is: " + avaerage(10,20,30,40));
	

	}

}
