package part_2_String;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Concept {

	public static void main(String[] args) {

		String s[] = { "AAA", "BBB", "CCCC", "DDD", "EEE" };
		String s1[] = { "FFF", "GGG", "HHH", "AAA", "CCC" };

		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (String x : s) {
			list1.add(x);
		}

		for (String y : s1) {
			list1.add(y);
		}
		
//		for(int i=0; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}

		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 0, 2);
		printMe(list1);
		reverseMe(list1);

//		System.out.println(list1);
//		System.out.println(list2);
	}

	private static void printMe(List<String> list1) {
		
		for(String l: list1) {
			System.out.printf("%s\n", l);
			
		}
		System.out.println("*****");

	}

	private static void removeStuff(List<String> list1, int from, int to) {

		list1.subList(from, to).clear();;
	}

	private static void reverseMe(List<String> list1) {
		
		ListIterator<String> list_itr = list1.listIterator(list1.size());
		
		System.out.println("REVERSW");
		
		while(list_itr.hasPrevious()) {
			System.out.printf("%s\t", list_itr.previous());
		}
		
		

	}

}
