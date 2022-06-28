package queueCollections;

import java.util.PriorityQueue;

public class PriorityQueueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue p = new PriorityQueue();
		
		System.out.println(p.peek()); //Null; retrive first element do not remove element
		//System.out.println(p.element()); //throws an exception 
		
		for(int i =0; i<=10; i++) {
			p.offer(i);
			//default natural sorting order
		}
		
		System.out.println(p);
		System.out.println(p.poll()); //remove first element and retrive first element; return null if queue is empty
		System.out.println(p);
		System.out.println(p.remove()); //remove first element and retrive first element ; but give exception when queue is empty
		System.out.println(p);
	}

}
