package concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class CHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap chm = new ConcurrentHashMap();
		
		chm.put(101, "A");
		
		chm.put(102, "B");
	
		chm.put(103, "C");
		chm.putIfAbsent(104, "D");
		System.out.println(chm);
		chm.putIfAbsent(101, "B");
		System.out.println(chm);
		
		chm.remove(101,"D");
		System.out.println(chm);
		chm.replace(101, "A","F");
		
		System.out.println(chm);
		

	}

}
