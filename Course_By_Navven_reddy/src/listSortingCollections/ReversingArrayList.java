package listSortingCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add("A");
		al.add("K");
		al.add("B");
		al.add("C");
		al.add("a");

		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);

	}

}
