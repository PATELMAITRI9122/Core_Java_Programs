package String_Concept;

import java.util.Scanner;

public class Swap_2_Number {

	public static void swapNumbers(int a, int b) {

		int c = a;
		int d = b;
		

		d = d + c;
		c = d - c;
		d = d - c;

		System.out.printf("a is %d, b is %d", c, d);

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swapNumbers(a, b);

	}
}
