package Collection;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//duplicate are not allowed
		//insertion order does not preserved
		//hetrogenous allowed

		HashSet h = new HashSet();
		
		h.add("M");
		h.add("A");
		//h.add("I");
		System.out.println(h.add("I")); //true
		h.add("T");
		h.add("R");
		
		
		h.add(null);
		
		System.out.println(h.add("I"));
		System.out.println(h);
		
		
		
	}

}
