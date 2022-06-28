package mapCollections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdentityHashMap m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "Maitri");
		m.put(i2, "Harsh");

		System.out.println(m);

	}

}
