package tutorial_3;

import java.util.Scanner;

public class multipleClass2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		multipleClasses object = new multipleClasses();
//		object.simpleMessage();
//		
//		methodwithpara object2 = new methodwithpara();
//		System.out.println("What is your name? ");
//		
//		
//		String message = input.nextLine();
//		
//		object2.simpleMessage(message);
//		
//		System.out.println("Succefully compiled!!!");
		
		manyMethodManyInstance object = new manyMethodManyInstance("Maitri");
		
		System.out.println("Enter the name of first girl friend name: ");
		
		//String name = input.nextLine();
		
		//object.setName(name);
		
		object.saying();
	}

}
