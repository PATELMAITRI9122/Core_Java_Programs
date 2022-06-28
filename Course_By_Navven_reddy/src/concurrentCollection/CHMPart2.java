package concurrentCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CHMPart2 extends Thread {

	static ConcurrentHashMap chm = new ConcurrentHashMap();

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Child Threading");
			chm.put(103, "AAA");
		}
	}

	public static void main(String[] args) throws Exception {

		chm.put(101, "BBB");
		chm.put(102, "CCCC");

		CHMPart2 thread = new CHMPart2();
		thread.start();

		Set s1 = chm.keySet();

		Iterator itr = s1.iterator();

		while (itr.hasNext()) {
			// itr.next();

			Integer i1 = (Integer) itr.next();

			System.out.println("Main Thread" + i1 + chm.get(i1));

			Thread.sleep(3000);

		}

		System.out.println(chm);

	}

}
