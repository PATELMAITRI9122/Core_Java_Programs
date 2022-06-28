package method_refrence_constructor_refrence;

public class Example1 {

	public static void main(String[] args) {

		InterA i = (a, b) -> System.out.println("The sume of 2 Number is: " + (a + b));
		i.add(10, 20);
		
		InterA i1 = Example1 :: sum;
		i1.add(100, 200);
	}
	
	public  static void sum(int x, int y) {
		System.out.println("The sum of X and Y is: " + (x+y));
	}

}

interface InterA {
	public void add(int A, int B);
}
