package part_2_String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class List_To_Array_VICE {

	public static void main(String[] args) {
		
		String stuff[] = {"HELLO", "AAA","BBB"};
		
		LinkedList<String> list = new  LinkedList<String>(Arrays.asList(stuff));
		
		list.add("BYE");
		list.addFirst("GOOD_MORNING");
		
		// Convert Back to Array
		
		stuff = list.toArray(new String[list.size()]);
		
		for(String x: stuff)	
			System.out.printf("%s \t", x);
	}

}
