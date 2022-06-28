package String_Concept;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		//list.descendingIterator().forEachRemaining(list2::add);
		list.descendingIterator().forEachRemaining(list2::add);
		System.out.println(list2);
	}

} 	