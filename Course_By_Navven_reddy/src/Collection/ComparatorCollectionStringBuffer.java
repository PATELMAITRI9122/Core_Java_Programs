package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorCollectionStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new myComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("O"));
		t.add(new StringBuffer("B"));
		
		System.out.println(t);

	}

}

class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareTo(s2);
	}
	
	
}