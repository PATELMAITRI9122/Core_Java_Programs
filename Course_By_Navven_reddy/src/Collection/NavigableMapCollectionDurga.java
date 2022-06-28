package Collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapCollectionDurga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableMap<String, String> nmap = new TreeMap<String, String>();
		
		nmap.put("A", "AAA");
		nmap.put("B", "BBB");
		nmap.put("C", "CCC");
		nmap.put("D", "DDD");
		
		System.out.println(nmap);
		
		System.out.println(nmap.ceilingKey("B")); // only gives key
		System.out.println(nmap.ceilingEntry("B")); // return key with value
		System.out.println(nmap.higherKey("B"));
		System.out.println(nmap.higherEntry("B"));
//		
//		System.out.println(nmap.floorKey("C"));
//		System.out.println(nmap.lowerKey("C"));
//		
//		System.out.println(nmap.pollFirstEntry());
//		System.out.println(nmap);
//		
//		System.out.println(nmap.pollLastEntry());
//		System.out.println(nmap);
		

	}

}
