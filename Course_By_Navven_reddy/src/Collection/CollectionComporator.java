package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class collectionMain implements Comparable {

	int e_id;
	String e_name;

	public collectionMain(int e_id, String e_name) {
		// TODO Auto-generated constructor stub

		this.e_id = e_id;
		this.e_name = e_name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return e_id + " -- " + e_name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		int eid1 = this.e_id;

		collectionMain c = (collectionMain)o;

		int eid2 = c.e_id;

		if (eid1 < eid2)
			return -1;
		else if (eid1 > eid2)
			return +1;
		else
			return 0;
	}

}

class cc implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		collectionMain c1 = (collectionMain)o1;
		collectionMain c2 = (collectionMain)o2;
		
		String s1 = c1.e_name;
		String s2 = c2.e_name;
		
		
		return s1.compareTo(s2);
	}
	
}

public class CollectionComporator {

	public static void main(String[] args) {

		collectionMain c = new collectionMain(1, "MAITRI");
		collectionMain c1 = new collectionMain(2, "Harsh");
		collectionMain c2 = new collectionMain(3, "Brijesh");
		collectionMain c3 = new collectionMain(4, "Harsh");

		/*TreeSet t = new TreeSet(); //natural sorting order
		t.add(c);
		t.add(c1);
		t.add(c2);
		t.add(c3);

		System.out.println(t);*/
		
		TreeSet t1 = new TreeSet(new cc()); // customized sorting
		
		t1.add(c);
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);
		
		System.out.println(t1);
		
	}

}
