package mapCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPracticePart1 {

	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(101, "AA");
		map.put(102, "BB");
		map.put(103, "CC");

		Set s = map.keySet(); // for Key

		Set set = map.entrySet(); // for value

		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry value = (Map.Entry)itr.next();
			
			System.out.println(value.getKey() + " " + value.getValue());
		}

	}

}
