package listSortingCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSearchCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add("K");
		al.add("B");
		al.add("C");
		al.add("a");
		
		
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, "K")); //unpredictable result
		
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "K")); //return index
		System.out.println(Collections.binarySearch(al, "b")); //return insertion point
		System.out.println(Collections.binarySearch(al, "D")); // return insertion point

	}

}
