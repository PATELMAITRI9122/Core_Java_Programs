package part_2_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list_add_All {

	public static void main(String[] args) {

		String stuff[] = { "AA", "BB", "CC" };

		List<String> list = Arrays.asList(stuff);

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("FF");
		list1.add("LL");
		list1.add("II");

		for (String x : list1)
			System.out.printf("%s\t", x);
		
		Collections.addAll(list1, stuff);
		System.out.println();
		
		for (String x : list1)
			System.out.printf("%s\t", x);
		
		System.out.println();
		System.out.println(Collections.frequency(list1, "AA"));
		
		boolean ans = Collections.disjoint(list, list1);
		System.out.println(ans);
		
		if(ans)
			System.out.println("IT'S NO MATCH");
		else
			System.out.println("THESES LIST MUST HAVE SOMETHING COMMON");

	}
	
	

}
