package Collection;

import java.util.TreeSet;

public class compareToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("B"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null));
		
		TreeSet t = new TreeSet();
		t.add("B"); // this will react as a obj2
		t.add("2"); // this will react as a obj1 
		t.add("A");
		//t.add(new StringBuffer("F"));
		System.out.println(t);
	}

}
