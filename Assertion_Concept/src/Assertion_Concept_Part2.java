
public class Assertion_Concept_Part2 {
	
	int z = 5;
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * 
	 * @param x
	 * inappropriate use of assert
	 */
	public void m1(int x) {
		assert(x>10);
		
		switch(x) {
		case 10: System.out.println(10);
				 break;
		case 11: System.out.println(11);
				 break;
		default: assert(false); //appropriate use of assert
		}
	}
	
	private void m2(int x) {
		assert(x<10); //appropriate
	}
	
	private void m3() {
		assert(m4()); //in-appropriate program logic mixed
	}
	
	private boolean m4() {
		z = 6; //assertion enable true z = 6 -> disable z = 5
		return true;
	}

}
