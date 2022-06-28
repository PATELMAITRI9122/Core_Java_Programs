/**
 * 
 * @author Maitri
 * Simple assertion statement demo program 
 * Augmented Assertion statement d
 */
public class Assertion_Concept_Part1 {
	
	public static void main(String[] args) {
		
		int x = 10;

//		System.out.println("Start");

		assert (x>10) : x=11;

//		System.out.println("Fail");

		System.out.println(x);
	}
	
	public static boolean m1() {
		return true;
	}

}
