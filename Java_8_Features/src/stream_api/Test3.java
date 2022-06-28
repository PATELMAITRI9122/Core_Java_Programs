package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("AAA");
		list.add("AAAAAAAA");
		list.add("A");
		list.add("AB");
		list.add("AAAAAAAAAAAAAAAA");
		
		System.out.println(list);
		System.out.println();
		
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println();
		
		List<String> UnSortedList = list.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(UnSortedList);
		System.out.println();
		
		System.out.println("Sort the list according to the increasing length of the String");
		//System.out.println();
		
		Comparator<String> c = (s1,s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			
			if(l1 < l2)
				return -1;
			else if(l1 > l2)
				return +1;
			else
				return s1.compareTo(s2);
		};
		
		List<String> increasedSortedString = list.stream().sorted(c).collect(Collectors.toList());
		System.out.println(increasedSortedString);
		
	}

}
