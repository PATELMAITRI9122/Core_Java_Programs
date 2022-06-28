package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentReplace extends Thread {

	static CopyOnWriteArrayList list = new CopyOnWriteArrayList();

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread Updating List");
			list.add("C");

		}
	}

	public static void main(String[] args) throws InterruptedException {

		list.add("A");
		list.add("B");

		ConcurrentReplace t = new ConcurrentReplace();
		t.start();

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("Main Thread Updating: " + s);
			Thread.sleep(3000);
		}
		System.out.println(list);

	}

}
