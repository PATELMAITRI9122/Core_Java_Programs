package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetCollectionDUrga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet<Integer> nset = new TreeSet<Integer>();
		
		nset.add(1000);
		nset.add(2000);
		nset.add(3000);
		nset.add(4000);
		nset.add(5000);
		
		System.out.println(nset);
		System.out.println(nset.ceiling(2000));
		System.out.println(nset.higher(2000));
		System.out.println(nset.floor(3000));
		System.out.println(nset.lower(3000));
		
		System.out.println("****");
		
		System.out.println(nset.pollFirst());
		System.out.println(nset);
		System.out.println(nset.pollLast());
		System.out.println(nset);
		
		System.out.println(nset.descendingSet());

	}

}
