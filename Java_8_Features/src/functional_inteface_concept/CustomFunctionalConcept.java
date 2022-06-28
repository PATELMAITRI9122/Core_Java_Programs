package functional_inteface_concept;

import java.util.function.Function;
import java.util.function.Predicate;

public class CustomFunctionalConcept {

	public static void main(String[] args) {

		// marks > 80 -> A
		// marks > 60 -> B distiction
		// marks -> 50 -> C second class
		// marks > 30 -> D grade
		// marks >20 -> fail

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";

			if (marks >= 80) {
				grade = "A";
			} else if (marks >= 70)
				grade = "B";
			else if (marks >= 60)
				grade = "c";
			else if (marks >= 50)
				grade = "D";
			else
				grade = "fail";

			return grade;
		};

		Student[] s = { new Student("Maitri", 10), new Student("Harsh", 20), new Student("Brijesh", 40),
				new Student("Anjali", 60), new Student("Pinky", 50), new Student("Devu", 50) };

		Predicate<Student> p = s1 -> s1.marks >= 60;

		for (Student s1 : s) {

			if (p.test(s1)) {

				System.out.println("Student Name: " + s1.name);
				System.out.println("Student Marks: " + s1.marks);
				System.out.println("Student Grade: " + f.apply(s1));
			}	
		}
	}
}

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
