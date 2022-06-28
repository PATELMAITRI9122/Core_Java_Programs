package concurrentCollection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		
		map.put("A", 100);
		map.put("B", 200);
		map.put("c", 300);
		
		System.out.println("MAP VALUE: " +map.toString());
		
		System.out.println("Compute if absent: " );
		System.out.println(map.containsValue("A"));
		
	
		
		

	}

}
