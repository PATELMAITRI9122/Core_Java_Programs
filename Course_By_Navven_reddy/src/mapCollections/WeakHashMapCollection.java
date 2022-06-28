package mapCollections;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.WeakHashMap;

public class WeakHashMapCollection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WeakHashMap h = new WeakHashMap();
		Temp p = new Temp();
		h.put(p, "Maitri");
		System.out.println(h);
		// h.put(1, "ABC");
		p = null;
		System.gc();

		Thread.sleep(500);

		System.out.println(h);

	}

}

class Temp {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Maitri";
	}

	public void finalize() {
		System.out.println("Finalize Method");
	}

}
