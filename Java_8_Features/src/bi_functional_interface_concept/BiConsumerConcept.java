package bi_functional_interface_concept;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerConcept {

	public static void main(String[] args) {

		ArrayList<Employee3> list = new ArrayList<Employee3>();
		populate(list);

		//Increment of salary 
		BiConsumer<Employee3, Double> conObject = (e,d) -> e.salary = e.salary + d;
		
		for(Employee3 e: list) {
			conObject.accept(e, 500.0);
		}
		
		for(Employee3 e: list) {
			System.out.println("Employee Name: " + e.name + " Employee Salary: " + e.salary);
			System.out.println();
		}
	}

	public static void populate(ArrayList<Employee3> list) {
		list.add(new Employee3("Maitri", 10000));
		list.add(new Employee3("Harsh", 7000));
		list.add(new Employee3("Brijsh", 65000));
		list.add(new Employee3("Anjali", 80000));

	}
}

class Employee3 {
	String name;
	double salary;

	public Employee3(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}
