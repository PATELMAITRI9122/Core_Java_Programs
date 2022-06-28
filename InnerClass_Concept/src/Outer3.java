
public class Outer3 {
	
	int a = 20;
	static int b = 50;
	
	public static void m1() {
		
		//System.out.println(a);
		System.out.println(b);
		
		class Inside_Inner{
			
			public void sum(int x, int y) {
				System.out.println("The sum is: " + (x+y));
			}
			
		}
		
		Inside_Inner obj = new Inside_Inner();
		obj.sum(10, 20);
		obj.sum(1000, 5000);
		
		
	}
	
	public static void main(String[] args) {
		
		Outer3 object = new Outer3();
		object.m1();
		
		Outer3.m1();
		
	}

}

