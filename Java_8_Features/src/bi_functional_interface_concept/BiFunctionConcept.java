package bi_functional_interface_concept;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionConcept {

	public static void main(String[] args) {

		ArrayList<Employee2> list = new ArrayList<Employee2>();

		BiFunction<String, Integer, Employee2> biObject = (name, eno) -> new Employee2(name, eno);
		// Employee2 obj = biObject.apply("Maitri", 01);
		
		list.add(biObject.apply("Maitri", 01));
		list.add(biObject.apply("Harsh", 02));
		list.add(biObject.apply("Brijesh", 03));
		list.add(biObject.apply("Anjali", 04));
		
		for(Employee2 e: list) {
			System.out.println(e.name + ": " + e.eno);
		}

	}

}

class Employee2 {
	String name;
	int eno;

	public Employee2(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}
}
