package singltonConcept;

public class singltonUpperCaseExample {

	private static singltonUpperCaseExample single_instance1 = null;
	
	public String s;
	
	private singltonUpperCaseExample() {
		s = "Upper Case Example";
	}
	
	public static singltonUpperCaseExample getInstance() {
			if(single_instance1 == null)
				single_instance1 = new singltonUpperCaseExample();
			return single_instance1;
	}
	
	
	public static void main(String[] args) {
		
		singletonPatternConcept x = singletonPatternConcept.getInstance();
		singletonPatternConcept y = singletonPatternConcept.getInstance();
		singletonPatternConcept z = singletonPatternConcept.getInstance();
		
		x.s = (x.s).toUpperCase();
		
		System.out.println("String from x is: " +x.s);
		System.out.println("String from y is: " +y.s);
		System.out.println("String from z is: " +z.s);
		
		System.out.println("***");
		
		z.s = (z.s).toLowerCase();
		
		System.out.println("String from x is: " +x.s);
		System.out.println("String from y is: " +y.s);
		System.out.println("String from z is: " +z.s);

	}

}
