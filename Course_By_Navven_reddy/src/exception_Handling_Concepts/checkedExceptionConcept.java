package exception_Handling_Concepts;

import java.io.PrintWriter;

public class checkedExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ans;

		PrintWriter pw = new PrintWriter("abc.txt");

		// here abc.txt file is not availiable ->
		// There would be a chance to arise exception
		// this conversation done by compiler

		// OUTPUT: Compiler will alert that this exception can be arise

		pw.println("Hello");

		System.out.println("I want to sleep very hapiily");

		Thread.sleep(1000);

		// 1. Main Thread -> want to sleep
		// Compiler -> cannot compile code
		// If main method -> Enter to sleep mode -> There is chance to other thread to
		// sleep as well
		// Interrupted Exception -> will arise

	}

}
