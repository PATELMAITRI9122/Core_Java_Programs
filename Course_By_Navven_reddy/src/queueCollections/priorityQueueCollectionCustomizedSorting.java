package queueCollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueueCollectionCustomizedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p = new PriorityQueue(15, new myComparator());

		p.offer("Maitri");
		p.offer("Patel");
		p.offer("IT");
		p.offer("Course");
		// p.offer(null); // NULL POINTER EXCEPTION

		System.out.println(p);

	}

}

class myComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		String s1 = (String) o1;
		String s2 = (String) o2;

		return -s2.compareTo(s1);
	}

}
