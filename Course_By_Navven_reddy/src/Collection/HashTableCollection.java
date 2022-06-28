package Collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		
		//Inserting an element to hash table
		ht1.put(1,"Maitri");
		ht1.put(2, "Harsh");
		ht1.put(3, "Brijesh");
		
//		ht1.put(null, null);args //NULL POINTER EXCEPTION
		//ht1.put(null, "ABC"); //NULL POINTER EXCEPTION
		//ht1.put(4, null); // NULL POINTER EXCEPTION
		
		//System.out.println(ht1);
		
		Hashtable<Integer, String> ht2 = new Hashtable<>();
		Hashtable<Integer, String> ht3 = new Hashtable<Integer, String>(2);
		
		ht2.put(1, "ONE");
		ht2.put(2, "TWO");
		ht2.put(3, "THREE");
		
		for(Map.Entry<Integer, String> m : ht2.entrySet()) {
			//System.out.println(m.get);
			System.out.println(m.getKey() + " " + m.getValue() + " " + m.getClass());
		}
	
		HashSet<Integer> h = new HashSet<Integer>();
		
		
		//System.out.println(ht2); //INSERTION ORDER -> USING HASH CODE OF THE OBJECT
		
		ht3.put(4, "FOUR");
		ht3.put(5, "FIVE");
		ht3.put(6, "SIX");
		ht3.put(6, "SIX"); // Duplicate value ignored
		ht3.put(7, "SIX");
		
		System.out.println(ht3);
		System.out.println(ht3.hashCode());
		System.out.println(ht3.size());
		
		//Map<Integer, String> m = new Hashtable<String, Integer>(); // Can not alter the type 
		// TYPE mismatch error
		
		//Map<Integer, String> m1 = new Map<Integer, String>();
		// can not create object of map -> becuse map is an inteface 
		
		//Map<Integer, String> m = new Hashtable<Integer, String>();
		
		//for(ht2.En)
		
		

		

	}

}
