package mapCollections;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapUsingTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<String, String> map = new TreeMap<String, String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return -o2.compareTo(o1);
			}
		});
		
		map.put("India", "Maitri");
		map.put("UK", "Parth");
		map.put("Sweta", "US");
		
		System.out.println(map);
		
		map.remove("Sweta");
		
		System.out.println(map);

	}

}
