package mapCollections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "ABC");
		map.put(101, "KLJ");
		map.put(102, "JJJ");

		for (Map.Entry mapp : map.entrySet()) {
			System.out.println(mapp.getKey() + " " + mapp.getValue());
		}

		map.remove(101);
		System.out.println(map);

		System.out.println("********");

		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();

		nmap.put(100, "SURAT");
		nmap.put(101, "RAJKOT");
		nmap.put(102, "BARODA");
		nmap.put(103, "RAJKOT");
		

		System.out.println(nmap); // natural sorting order by key

		NavigableMap<Integer, String> nmap1 = new TreeMap<Integer, String>();

		nmap.put(200, "SURATAA");
		nmap.put(201, "RAJKOTSS");
//		nmap.put(202, "RAJKOT");
		nmap.put(203, "BARODA");

		NavigableMap remap = nmap.descendingMap();

		System.out.println(remap);

		System.out.println("HEAD MAP: " + nmap.headMap(99, false));

		System.out.println("Tail Map: " + nmap.tailMap(101, true));

		System.out.println("sub Map: " + nmap.subMap(100, true, 103, true));
		
		System.out.println("********");
		
		SortedMap<Integer, String> smap = new TreeMap<Integer, String>();
		
		smap.put(100,"PATEL");
		smap.put(101, "MAITRI");
		smap.put(102, "HARSH");
		smap.put(103, "PATEL");
		
		System.out.println(smap);
		
		System.out.println("Head Map: " +smap.headMap(102));
		
		System.out.println("Tail Map: " + smap.tailMap(102));
		
		System.out.println("Sub Map: " + smap.subMap(100, 102));
		
		

	}

}
