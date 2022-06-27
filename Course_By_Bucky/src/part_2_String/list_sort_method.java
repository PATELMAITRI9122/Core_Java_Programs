package part_2_String;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class list_sort_method {

	public static void main(String[] args) {
		
		String[] crap = {"HELLO","GOOD","MORNING","HOW","ARE","YOU?"};
		
		//ARRAY TO LIST
		List<String> list = new LinkedList<String>(Arrays.asList(crap));
		
		Collections.sort(list);
		System.out.printf("%s\n",list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("%s\n",list);
	}

}
