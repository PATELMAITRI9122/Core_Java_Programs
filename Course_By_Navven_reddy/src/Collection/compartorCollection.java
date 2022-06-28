package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class compartorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * BY DEFAULT - IT WILL PROVIDE NATURAL SORTING ORDER BUT WE WANT OUR OWN
		 * CUSTOMIZED SORTING
		 */

		TreeSet t = new TreeSet(new MyComparator()); // internally i am passing the object of compartor object
		t.add(10);
		t.add(20);
		t.add(0);
		t.add(20);
		t.add(15);

		System.out.println(t);

	}
}

 class MyComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub

			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;

			//return i1.compareTo(i2); // natural sorting order using comparator
			
			//return i2.compareTo(i1); // descending order
			
			//return -i1.compareTo(i2); //descending order
			
			//return -i2.compareTo(i1); //acesnding order
			
			//return +1; //elements will only be added after first element // no comparision
			
			//return -1; //last elemts will be added first and follow reverse order
			
			return 0; // only first element will be added to the object and all other elemts consider as duplicate 
		}

	}


