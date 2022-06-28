package JavaBasics;

import java.util.Hashtable;

public class HashTableCollection {
	
	
	// HashTable as well is a type of dynamic Array
	// rather than store data based on index it store data on key value pair

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		
		h.put("A", "0");
		h.put("B", "1");
		h.put("C", "2");
		
		h.put(2, "v");
		
		System.out.println(h.size());
		System.out.println(h.get("A"));
		System.out.println(h.get(2));
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "1");
		

	}

}
