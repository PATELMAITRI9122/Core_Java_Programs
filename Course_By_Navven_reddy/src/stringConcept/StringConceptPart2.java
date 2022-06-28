package stringConcept;

public class StringConceptPart2 {

	public static void main(String[] args) {
	
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");
		
		System.out.println(s1==s2); //false
		
		String s3 = "You cannot change me";
		System.out.println(s1==s3); //false
		
		String s4 = "You cannot change me";
		System.out.println(s3==s4); //true
		
		String s5 = "You cannot" + "change me"; //both constant -> compile time
		System.out.println(s5==s4); //false -> doubt
		
		String s6 = "You cannot";
		//String s7 = s6 + "change me"; //one constant -> one var -> Run time
		System.out.println("**");
		String s7 = s6.concat("change me"); //false
		
		System.out.println(s4==s7); //false
		
		final String s8 = "You cannot"; 
		String s9 = s8 + "change me"; // both constant 
		System.out.println(s4==s9); //false -> doubt
		
		
		
		

	}

}
