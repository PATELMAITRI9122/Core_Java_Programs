package concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionExample extends Thread {

	static ArrayList l = new ArrayList();

	@Override
	public void run() {

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			System.out.println("Child Thread: ");
			l.add("J");
		}

	}

	public static void main(String[] args) throws Exception {
		
		l.add("L");
		l.add("B");
		l.add("G");
		
		ConcurrentModificationExceptionExample t = new ConcurrentModificationExceptionExample();
		t.start();
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println("Main Thread" +s);
			Thread.sleep(1000);
		}
		System.out.println(l);
		

	}

}
