package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		
		ar.add("Maitri");
		ar.add('H');
		ar.add(12.33);
		 System.out.println(ar.size());
		 
		 for(int i = 0; i<ar.size(); i++) {
			 System.out.println(ar.get(i));
		 }
		 
		 //if i want to add only integers value in ArrayList
		 
		 ArrayList<Integer> e = new ArrayList<Integer>();
		// e.add("Maitri");
		 e.add(20);
	}

}
