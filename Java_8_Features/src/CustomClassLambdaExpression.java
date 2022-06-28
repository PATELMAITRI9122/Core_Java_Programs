import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomClassLambdaExpression {

	public static void main(String[] args) {
		
//		Employee emp = new Employee("Maitri", 01);
//		System.out.println(emp);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Maitri", 02));
		emp.add(new Employee("Harsh", 04));
		emp.add(new Employee("Brijesh", 03));
		emp.add(new Employee("Anjali", 01));
		
		System.out.println(emp);
		
		Collections.sort(emp, (e1,e2)->(e1.eno < e2.eno)?-1:(e1.eno > e2.eno)?1 : 0);
		System.out.println(emp);
		
		System.out.println("***");
		
		//sort employee data based on alphabetical order
		Collections.sort(emp, (e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(emp);
	}
}

class Employee {
	String name;
	int eno;

	public Employee(String name, int eno) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.eno = eno;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + eno;
	}
}
