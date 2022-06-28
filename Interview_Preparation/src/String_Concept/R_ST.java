package String_Concept;

import java.util.Scanner;

public class R_ST {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter String: ");
		String str = input.nextLine();
		
		System.out.println(reverse(str));

	}

	public static String reverse(String str) {

		if (str == null)
			throw new IllegalArgumentException();
		else {

			// String converted into Character Array
			char[] chars = str.toCharArray();

			// Need one more array to store reverse string character array
			StringBuffer sb = new StringBuffer();

			// logic for reverse
			for (int i = chars.length - 1; i >= 0; i--) {
				sb.append(chars[i]);
			}

			return sb.toString();
		}
		
	

	}
}
