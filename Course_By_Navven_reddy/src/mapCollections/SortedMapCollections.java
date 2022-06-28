package mapCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer, String> map = new TreeMap();

		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "LKJ");
		map.put(new Integer(4), "OHU");

		Set s = map.entrySet();
		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
//			int key = (Integer)m.getKey();
//			String value = (String)m.getValue();

			System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());

		}
		
		map.remove(3);
		System.out.println(map);

	}

}
