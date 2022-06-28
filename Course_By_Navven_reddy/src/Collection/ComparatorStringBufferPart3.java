package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorStringBufferPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new myCC());
		t.add(new StringBuffer("ABCD"));
		t.add(new StringBuffer("ZA"));
		t.add(new StringBuffer("ZA")); // duplicate //alphabetical order
		t.add(new StringBuffer("BCVG"));
		
		System.out.println(t);

	}

}

class myCC implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if (l1>l2) 
			return +1;
		else if (l1 < l2)
			return -1;
		else 
			return s1.compareTo(s2);
		
		
	}
	
}
