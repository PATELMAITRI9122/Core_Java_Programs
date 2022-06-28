package listSortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("HELLO");
		al.add("HOW");
		al.add("ARE");
		al.add("YOU");
		
		System.out.println("BEFORE SORTING: " + al);
		Collections.sort(al);
		System.out.println("AFTER SORTING: " + al);
	}

}
