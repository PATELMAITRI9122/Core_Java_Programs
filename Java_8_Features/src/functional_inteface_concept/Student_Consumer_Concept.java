package functional_inteface_concept;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student_Consumer_Concept {
	public static void main(String[] args) {

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";

			if (marks >= 80)
				grade = "A";
			else if (marks >= 60)
				grade = "B";
			else if (marks >= 50)
				grade = "C";
			else
				grade = "FAIL";

			return grade;
		};

		Student[] s = { new Student("Maitri", 80), new Student("Harsh", 60), new Student("Brijesh", 50),
				new Student("Anjali", 20) };

		Predicate<Student> p = s2 -> s2.marks >= 50;
		
		Consumer<Student> c = s3 -> {
			System.out.println("Student Name: " + s3.name);
			System.out.println("Student Marks: " + s3.marks);
			System.out.println("Student Grade: " + f.apply(s3));
		};
		
		
		
		for(Student s1: s) {
			if(p.test(s1)) {
				c.accept(s1);
			}
		}
		
		
		
/*
		for (Student s1 : s) {
			if (p.test(s1)) {
				System.out.println("Student Name: " + s1.name);
				System.out.println("Student Marks: " + s1.marks);
				System.out.println("Student Grade: " + f.apply(s1));
			}

		}
		*/

	}
}

class Student1 {
	String name;
	int marks;

	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
