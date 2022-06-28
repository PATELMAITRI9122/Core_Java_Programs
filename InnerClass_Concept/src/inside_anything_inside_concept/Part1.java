package inside_anything_inside_concept;

public class Part1  {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.m1();
		
		Outer ob1 = new Outer();
		ob1.m2();
	}

}

class Outer implements Part11.Part21{

	@Override
	public void m2() {
		
		System.out.println("Outer-Interface-m2() Method implementation");
		
	}
	
}

class Test implements Part11{
	@Override
	public void m1() {

		System.out.println("Outer-Interface-m1() Method implementation");

	}
	
}

interface Part11 {
	public void m1();

	interface Part21 {
		public void m2();
	}
}
