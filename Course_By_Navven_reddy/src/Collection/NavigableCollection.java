package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<Integer> set = new TreeSet<Integer>();

		//set.add(-5);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		NavigableSet<Integer> ns = set.descendingSet(); // for reverse order of the object

		System.out.println("Natural Order: " + set);
		System.out.println("Reverse Oder: " + ns);

		NavigableSet<Integer> threeOrMore = set.tailSet(20, true); // tail set method return - greater element after
																	// specified element; true - element inclusive
		// System.out.println("" + threeOrMore);

		System.out.println("Lower(40): " + set.lower(40)); // lower ; if specified element is lower -> return null; if
															// not return 1st lower
		System.out.println("Floor: " + set.floor(40));
		System.out.println("Higher: " + set.higher(11)); // only return greater than
		System.out.println("Ceiling: " + set.ceiling(0)); // return greater or equal to
		
		System.out.println("Poll First: " + set.pollFirst()); //retrive and remove the first lowest element
		System.out.println(set);
		
		System.out.println("Poll Last: " + set.pollLast()); //retrive and remove the last element
		System.out.println(set);
		
		System.out.println("Poll First: " + set.pollFirst()); //retrive and remove the first lowest element
		System.out.println(set);
		
		System.out.println("Poll Last: " + set.pollLast()); //retrive and remove the last element
		System.out.println(set);
		
		System.out.println("Poll Last: " + set.pollLast()); //retrive and remove the last element
		System.out.println(set);
		
		

	}

}
