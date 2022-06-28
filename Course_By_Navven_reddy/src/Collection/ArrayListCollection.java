package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListCollection {

	// ArrayList -> Dynamic Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[4]; // Static Array -> Size limited

		// Dynamic Array -> no size limitation
		// can contain duplicate values
		// maintain insertion order
		// synchronized - threft safe
		// slow compare to other collection
		// allow random access to fetch elements

		ArrayList array = new ArrayList();
		
		Collections.sort(array);
		
	
		
		

		// Add Element
		array.add(10); // index 0
		array.add(20); // index 1
		array.add(30); // index 2

		// check the size of arrayList
		System.out.println(array.size());

		array.add(40); // index 3
		array.add(50); // index 4
		array.add("MAITRI"); // index 5
		array.add(15.33);
		array.add('B');
		array.add(true);

		System.out.println(array.size());
		System.out.println(array.get(3));

		System.out.println("****");

		// to print all the elemnts from the arraylist
		// for loop or iterator can be used

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("######");

		// non - generic vs generic

		ArrayList<Integer> ar = new ArrayList<Integer>(); // Wrapper class -> Specified what type of data -> concept
															// known as generic after jdk 1.5
		ar.add(1);
		// ar.add(mm);

		// EmployeeList class object

		EmployeeList e1 = new EmployeeList("Maitri", 24, "IT DEPT");
		EmployeeList e2 = new EmployeeList("Brijesh", 27, "Mech Dept");
		EmployeeList e3 = new EmployeeList("Harsh", 23, "IT DEPT");

		// Create ArrayList

		ArrayList<EmployeeList> ar2 = new ArrayList<EmployeeList>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);

		// Using iterator to travse the data
		// Iterator does not use index
		// Iterator is a object used to loop through collections

		Iterator<EmployeeList> it = ar2.iterator();

		while (it.hasNext()) {
			EmployeeList emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}

		// addAll()

		ArrayList ar5 = new ArrayList();
		ar5.add("Hello");
		ar5.add("From");
		ar5.add("Maitri");

		ArrayList ar6 = new ArrayList();
		ar6.add("aa");
		ar6.add("bb");
		ar6.add("cc");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {

			System.out.println(ar5.get(i));

		}

		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {

			System.out.println(ar5.get(i));

		}

//retainAll()
		
		System.out.println("87878787878");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("aa");
		ar7.add("bb");
		ar7.add("cc");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("aa");
		ar8.add("ee");
		ar8.add("ff");
		
		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {

			System.out.println(ar7.get(i));

		}

	}

}
