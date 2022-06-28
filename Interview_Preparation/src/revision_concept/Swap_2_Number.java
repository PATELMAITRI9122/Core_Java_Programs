package revision_concept;

public class Swap_2_Number {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		//System.out.println(swapNumbers(a,b));
		swapNumbers(a, b);
		
	}

	public static void swapNumbers(int a, int b) {
		b = b+a;
		a = b-a;
		b = b-a;
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
