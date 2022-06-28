package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListColletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList l = new LinkedList();
//		l.add("Maitri");
//		l.add("Patel");
//		l.add("Harsh");
//		l.add("Patel");
//		
//		Iterator i = l.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		LinkedList l = new LinkedList();
		l.add("Maitri");
		l.add(30);
		l.add(null);
		System.out.println(l);
		l.set(0, "Brijesh");
		System.out.println(l);
		l.set(0, "MaitriB");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Hello");
		System.out.println(l);
		
		
		

	}

}
