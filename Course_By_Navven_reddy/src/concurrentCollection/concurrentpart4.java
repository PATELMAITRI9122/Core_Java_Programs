package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentpart4 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList cowl = new CopyOnWriteArrayList();
		
		cowl.add("A");
		cowl.add("B");
		cowl.add("C");
		cowl.add("D");
		
		Iterator itr = cowl.iterator();
		
		System.out.println(cowl);
		
		cowl.add("E"); // This will create seperate copy of same object and in the old copy of object updation will not be met
		
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println("***" + s);
		}
		
		System.out.println(cowl);

	}

}
