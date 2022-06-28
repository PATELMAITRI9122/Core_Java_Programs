package concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentReadRemove {

	public static void main(String[] args) {

	//	CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		ArrayList list = new ArrayList();
		list.add("AA");
		list.add("BB");
		list.add("DD");

		System.out.println(list);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			String s = (String) itr.next();

			if (s.equals("DD")) {
				itr.remove();
			}
		}
		System.out.println(list);

	}

}
