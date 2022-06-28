package stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		
		Integer[] array = list.stream().toArray(Integer[] ::new);
		
//		for(Integer i1 : array) {
//			System.out.println(i1);
//		}
		
		Stream.of(array).forEach(System.out::println);
	}

}
