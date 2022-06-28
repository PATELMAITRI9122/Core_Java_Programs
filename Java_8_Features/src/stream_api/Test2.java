package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();

		marks.add(0);
		marks.add(20);
		marks.add(10);
		marks.add(25);
		marks.add(75);
		marks.add(90);
		marks.add(44); 

		System.out.println("The list of Marks");
		System.out.println(marks);
		System.out.println();

		System.out.println("The Number of Failed Student");

		long noOfFailedStudent = marks.stream().filter(i -> i < 35).count();
		System.out.println(noOfFailedStudent);
		System.out.println();

		// Print for every student -> find out grace marks only

		System.out.println("Student Updated/graced Marks");
		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		System.out.println();

		// Sorted List Of Student Marks
		System.out.println("Sorted List of Student Marks");
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());	
		System.out.println(sortedMarks);
		System.out.println();
		
		//Customized/descending List of Student Marks
		System.out.println("Customized/Descending List of Student Marks");
		
		Comparator<Integer> c = (i1,i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;
		List<Integer> sortedMarks2 = marks.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		
		List<Integer> customizedSortedMarks = marks.stream().sorted(c).collect(Collectors.toList());
		System.out.println(customizedSortedMarks);
		System.out.println(sortedMarks2);
		System.out.println();
	}

}
