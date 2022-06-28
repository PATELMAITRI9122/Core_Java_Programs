package listSortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSearchCollectionsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add("A");
		al.add("K");
		al.add("B");
		al.add("C");
		al.add("a");

		System.out.println("UNsorted List");
		System.out.println(al);
		
		Collections.sort(al,new mycc());
		System.out.println("Sorted List");
		System.out.println(al);
		
		System.out.println("Searched Element");
		System.out.println(Collections.binarySearch(al, "a", new mycc()));
		System.out.println(Collections.binarySearch(al, "Z", new mycc()));
		System.out.println(Collections.binarySearch(al, "Z")); //unpredictable 
		
		

	}

}

class mycc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
	
}
