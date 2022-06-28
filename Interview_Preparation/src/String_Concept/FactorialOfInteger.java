package String_Concept;

public class FactorialOfInteger {
	
	public static void main(String[] args) {
		
		System.out.println(find_factorial(4));
		
	}

	public static long find_factorial(long n) {
		if(n == 1)
			return 1;
		else
			return (n * find_factorial(n - 1)); 
	}
}
