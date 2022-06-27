package part_2_String;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class list_reverse_copy {

	public static void main(String[] args) {

		Character array[] = { 'M', 'A', 'I', 'T', 'R', 'I' };

		List<Character> list = Arrays.asList(array);

		System.out.println("List is: ");
		output(list);

		// REVERSE AND PRINT OUT THE LIST
		Collections.reverse(list);
		System.out.println("AFTER REVERSE: ");
		output(list);

		// COPY OF THE LIST
		Character new_array[] = new Character[6];

		List<Character> new_list = Arrays.asList(new_array);
		
		Collections.copy(new_list, list);
		System.out.println("COPY  LIST: ");
		
		output(new_list);
		
		//FILL COLLECTION
		Collections.fill(list, 'x');
		System.out.println("AFTER FILLING THE LIST: ");
		output(list);
		

	}

	private static void output(List<Character> list) {
		
		for(Character thing: list) {
			System.out.printf("%s\t", thing);
		}
		
		System.out.println("*****");

	}

}
