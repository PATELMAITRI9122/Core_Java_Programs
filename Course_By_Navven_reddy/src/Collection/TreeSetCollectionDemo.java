package Collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(); // Default constructor natural sorting order
		
		t.add("A");
		t.add("B");
		t.add("a"); // will be added in the tree object at last position due to it's high ascii value
		t.add("C");
//		//t.add(null); NULL POINTER EXCEPTION
		System.out.println(t);
//		
		//System.out.println(t.add(new Integer(10))); 
//		
//		TreeSet t1 = new TreeSet();
//		
//		t1.add(10);
//		t1.add(20);
//		t1.add(30);
//		//t1.add(null);
//		//t1.add(null);
//		System.out.println(t1);
////		t1.add("M");
////		System.out.println(t1); // will not allowed me to add in the tree object as it is contain value only about to numeric 
//		
		TreeSet t2 = new TreeSet();
		//t2.add(null);
		t2.add("A");
		System.out.println(t2);

	}

}
