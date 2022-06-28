package method_refrence_constructor_refrence;

public class Constructor_refrence_Part1 {

	public static void main(String[] args) {

		/*
		 * InterB i = Sample :: new; Sample s1 = i.get("Hello Argument Constructor");
		 */

		// InterB i = (name, rollNo, marks,age) -> new Student(name, rollNo, marks,
		// age);

		// new Implementation using constructor refrence

		InterB i1 = Student::new;
		Student s1 = i1.get("Maitri", 9, 9, 9);
	}
}

interface InterB {

	// public Sample get(String s);

	public Student get(String name, int rollNo, int marks, int age);

}

/*
 * class Sample{
 * 
 * public Sample(String s) {
 * System.out.println("Sample Class Constructor Executed");
 * System.out.println("Sample Class Constructor with Argument: " + s); }
 * 
 * public Sample() { // TODO Auto-generated constructor stub
 * System.out.println("No-Argument Constructor"); }
 * 
 * }
 */

class Student {
	String name;
	int rollNo;
	int marks;
	int age;

	public Student(String name, int rollNo, int marks, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;

		System.out.println("Executed");
	}

}
