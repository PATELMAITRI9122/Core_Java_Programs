package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet set = new TreeSet();
		
		
		set.add("BMW");
		set.add("AUDI");
		set.add("Maitri");
		
		System.out.println("LIST:");
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		System.out.println("First Element: " +set.first());
		System.out.println("Last Element: " + set.last());
		System.out.println("HeadSet ELEMENT: " + set.headSet("BMW"));
		System.out.println("Tail Set ELEMENT: " + set.tailSet("BMW"));
		
		System.out.println("Sub SET" + set.subSet("AUDI", "Maitri"));
		
		System.out.println("Comparator: " + set.comparator());
			

	}

}
