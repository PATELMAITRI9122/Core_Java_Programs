package listSortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList al = new ArrayList();
		
		al.add("HELLO");
		al.add("HOW");
		al.add("ARE");
		al.add("YOU");
		
		System.out.println("BEFORE SORTING: " + al);
		Collections.sort(al, new myComparator());
		System.out.println("AFTER SORTING: " + al);

	}

}

class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return -s1.compareTo(s2);
	}
	
}
