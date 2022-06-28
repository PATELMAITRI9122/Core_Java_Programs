package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(25);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println();
		
		System.out.println("Sorted");
		Integer minvalue = list.stream().sorted().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(minvalue);
		
		Integer maxValue = list.stream().sorted().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println(maxValue);
		
		System.out.println("Unsorted");
		Integer minvalueUnsorted = list.stream().sorted().min((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println(minvalueUnsorted);
		
		Integer maxValueUnsorted = list.stream().sorted().max((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println(maxValueUnsorted);
		
		System.out.println("For Each Stream API");
		
		/*
		Consumer<Integer> f=i->{
			System.out.println("The sequare of " +i +  " is: " + (i*i));
			
		};*/
		//list.stream().forEach(System.out::println);
		//list.stream().forEach(f);
		list.stream().forEach(i->{
			System.out.println("The sequare of " +i +  " is: " + (i*i));
			
		});
	}

}
