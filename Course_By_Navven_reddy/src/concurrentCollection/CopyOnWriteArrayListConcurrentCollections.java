package concurrentCollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListConcurrentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		
		System.out.println(l);
		
		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		
		l1.addIfAbsent("A");
		l1.addIfAbsent("C");
		
		System.out.println(l1);
		
		l1.addAll(l); //normal add all method
		
		System.out.println(l1);
		
		CopyOnWriteArrayList l2 = new CopyOnWriteArrayList();
		
		l2.add("A");
		l2.add("E");
		
		l1.addAllAbsent(l2);
		
		System.out.println(l1);
		
		

	}

}
