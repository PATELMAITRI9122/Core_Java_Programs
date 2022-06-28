package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
//		Iterator i = v.iterator();
//		ListIterator ltr1 = v.listIterator();
//		
//		System.out.println(i.getClass().getName());
//		System.out.println(ltr1.getClass().getName());
		
		for(int i = 1; i<=10; i++) {
			v.addElement(i);
		}
		
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());
		//System.out.println(e.nextElement());
		
		while (e.hasMoreElements()) {
			Integer object = (Integer) e.nextElement();
			//System.out.println(object);
			
			if (object%2 == 0) {
				System.out.println(object);
			}
			
			
		}
		System.out.println(v);

				
	}

}
