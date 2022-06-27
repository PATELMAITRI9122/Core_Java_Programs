package part_2_String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collection_concept {

	public static void main(String[] args) {

		String[] word = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String[] things = {"eggs","milk","choclate","Sunday", "Monday", "Tuesday"};

		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		// add array into the list

		for (String w : word) {
			list.add(w);
		}
		
		for(String w1 :  things) {
			list1.add(w1);
		}

		for(int i =0; i<list.size(); i++) {
			System.out.printf("%s\n", list.get(i));
		}
		
//		for(int i =0; i<list1.size(); i++) {
//			System.out.printf("%s\t", list1.get(i));
//		}
		
		//edit_list(list, list1);
		edit_list(list, list1);
		System.out.println("****");
		
		for(int i =0; i<list.size(); i++) {
			System.out.printf("%s\n", list.get(i));
		}
	}

	
	public static void edit_list(Collection<String> l, Collection<String> l1) {
		
		Iterator<String> itr = l.iterator();
		
		while(itr.hasNext()) {
			if(l1.contains(itr.next())) {
				itr.remove();
			}
			
		}
		
	}
}
