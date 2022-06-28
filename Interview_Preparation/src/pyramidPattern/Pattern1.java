package pyramidPattern;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row to print: ");
		int rows = input.nextInt();
		
		input.close();
		
		System.out.println("Printing the pattern");
		printPattern(rows);
		
	}
	
	public static void printPattern(int rows) {
		
		for(int i =1; i<= rows; i++) {
			int whiteSpace = rows-i; //rows -> 8 whileSpace -> 8-1 = 7
			
			printString(" ", whiteSpace);
			printString(i + " ", i);
			System.out.println("");
		}
		
	}
	
	public static void printString(String s , int times) {
		for(int j = 0; j < times;j++) {
			System.out.println(s);
		}
	}

}
