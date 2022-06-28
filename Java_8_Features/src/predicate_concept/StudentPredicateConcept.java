package predicate_concept;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
}



public class StudentPredicateConcept {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Maitri", 6000));
		list.add(new Employee("Harsh", 1500));
		list.add(new Employee("Brijesh", 4000));
		list.add(new Employee("Anjali", 2000));
		
		//List the employee name who's salary is >3000
		
		Predicate<Employee> pree = emp -> emp.salary > 3000;
		for(Employee e : list) {
			if(pree.test(e)) {
				System.out.println(e.name + ":" + e.salary);
			}
		}
	}
}
