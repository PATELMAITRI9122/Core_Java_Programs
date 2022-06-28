
public class Outer4 {
	
	public void m1() {
		final int x = 10;
		
		class Inner{
			public void m2() {
				System.out.println(x);
			}
		}
		
		Inner obj = new Inner();
		obj.m2();
	}

	public static void main(String[] args) {
		
		Outer4 object = new Outer4();
		//object.m1();
		

	}

}
