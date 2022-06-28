package mapCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LInkedHashMapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(101, "Maitri");
		lhm.put(102, "Harsh");
		lhm.put(103, "Brijesh");
		
		Set set = lhm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {

			Map.Entry m1 = (Map.Entry)itr.next();
			
			System.out.println(m1.getKey() + " " + m1.getValue() );
		}
		
		Set set1 = lhm.keySet();
		
		System.out.println(set1);
		
		Collection c = lhm.values();
		System.out.println(c);
		
		//Set<Entry<Integer, String>> m2 = lhm.entrySet();
		System.out.println(lhm.entrySet());
		
		lhm.remove(103);
		System.out.println(lhm);
		
		
		
		

	}

}
