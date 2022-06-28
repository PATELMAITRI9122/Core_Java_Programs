package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollectionPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		System.out.println("Initial element of LinkedList: " +l); // null
		
		l.add("Maitri");
		l.add("613-790-9122");
		
		System.out.println("After adding Linked List: " + l);
		
		l.add(1,"Harsh");
		
		System.out.println("Third Operation:" + l );
		
		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println(l1);
		l1.addFirst("Hello");
		System.out.println(l1);
		l1.addLast("Bye");
		System.out.println(l1);
		
		Iterator i = l1.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
