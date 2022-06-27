package part_2_String;

import java.util.PriorityQueue;

public class QUEUE_CONCEPT {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.offer("HELLO");
		queue.offer("MAITRI");
		queue.offer("GOOD MORNING");
		
		System.out.printf("%s\n",queue);
		
//		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		System.out.printf("%s\n",queue);
		
	}

}

