package stream_api;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println(list);
		
		//filter number -> by only even numbers
		
		List<Integer> list2 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
	}
}
