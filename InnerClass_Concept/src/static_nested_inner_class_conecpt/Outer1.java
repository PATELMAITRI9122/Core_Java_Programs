package static_nested_inner_class_conecpt;

public class Outer1 {
	
	static class Nested{
		public void m1() {
			System.out.println("Calling Static class Nested method - m1()");
		}
	}
	
	public static void main(String[] args) {
		Nested obj = new Nested();
		obj.m1();
		
	//	Outer1 object = new Outer1();
		System.out.println();
		System.out.println("Calling Via Outer class");
		Outer1.Nested object = new Outer1.Nested();
		object.m1();
		
		
	}

}
