package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetWithTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet<String> ts = new TreeSet<String>();
		
		ts.add("Maitri");
		ts.add("Hello");
		ts.add("From");
		ts.add("IT");
		ts.add("Studu");
		ts.add("Java");
		
		String check = "WT";
	//	ts.add(null); // Null Pointer Exception
		
		System.out.println(ts);

		System.out.println("Contains Method: " + ts.contains(check));
		System.out.println("First Value: " + ts.first());
		System.out.println("Last Value: " + ts.last());
		
		ts.remove("IT");
		System.out.println(ts);
		System.out.println("Remove First Element: " + ts.pollFirst());
		System.out.println(ts);
		System.out.println("Remove Last Element: " + ts.pollLast());
		System.out.println(ts);
		
		for(String s :  ts) {
			System.out.println(s);
		}
	}

}
