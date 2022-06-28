package static_nested_inner_class_conecpt;

public class Outer2 {

	int x = 10;
	static int y = 20;

	static class Nested {

		public  void m1() {
			// System.out.println(x);
			System.out.println(y);
		}

		public static void main(String[] args) {
			// System.out.println("Outer-Main");

//			Outer2.Nested obj = new Outer2.Nested();
//			obj.m1();
			
			//Nested.m1();
			Nested ob = new Nested();
			ob.m1();

		}

	}
	
	public static void main(String[] args) {
//		Outer2.Nested ob = new Outer2.Nested();
//		ob.m1();
	}

}
