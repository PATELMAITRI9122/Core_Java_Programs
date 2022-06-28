package mapCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap m = new HashMap();
		
		m.put("Maitri", 101);
		m.put(102, "Harsh");
		m.put(103, "Brijesh");
		
//		for(Map.Entry map : m.entrySet()) {
//			
//		}
		
		//System.out.println(m);
		//System.out.println(m.put("ABC", 450));
		//System.out.println(m);
		Set s = m.keySet();
		//System.out.println(s);
		//Collection c = m.values();
		//System.out.println(c);
		
		Set set = m.entrySet();
		//set.add("ABC"); //  This will give me unsupported exception
		System.out.println(m);
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			
			System.out.println(m1.getKey() + "  " + m1.getValue() );
			
			if(m1.getKey().equals("Maitri")) {
				m1.setValue("Maitri");
				
			}
		}
		
		System.out.println(m);
		
		
		
	}

}
