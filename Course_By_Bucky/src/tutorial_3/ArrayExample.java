package tutorial_3;

import java.util.Iterator;
import java.util.Random;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int number[] = new int[10];
//		
//		number[1] = 10;
//		
//		System.out.println(number[1]);
		
//		int number[] = {1,2,3,4,5,6};
//		
//		System.out.println(number[2]);
		
		//System.out.println("Index\tValue");
		
		
		// Array Table
		
//		int number[] = {21,32,43,54,55,66};
//		
//		for(int counter = 0; counter < number.length; counter++) {
//			
//			System.out.println(counter + "\t" + number[counter]);
//		}
		
		// Summing elements of the array
		
//		int number[] = {21,32,43,54,55,66};
//		
//		int sum = 0;
//		
//		for(int counter = 0; counter < number.length; counter++) {
//			//sum = sum + number[counter];
//			
//			sum+=number[counter];
//			
//		}
//		
//		System.out.println("The sum of these number is = " +sum);
		
		// Array elements as a counter
		
		Random rand = new Random();
		
		int freq[] = new int[7];
		
		//int num = 10;
		
		
		for(int roll = 1; roll <1000; roll++) {
			
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for(int face = 1; face<freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
		}

	}

}
