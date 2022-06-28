
public class Outer5 {
	
	int i = 10;
	static int j = 20;
	
	public static void m1() {
		int k = 30;
		final int m = 40;
		
		class Inner{
			public static void m2() {
			//	System.out.println(i);
				System.out.println(j);
				//System.out.println(k);
				System.out.println(m);
			}
		}
		
		Inner obj = new Inner();
		obj.m2();
	}
	
	public static void main(String[] args) {
		
		Outer5 object = new Outer5();
		object.m1();
		
	
	}

}
