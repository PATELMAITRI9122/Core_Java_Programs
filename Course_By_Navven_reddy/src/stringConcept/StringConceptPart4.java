package stringConcept;

public class StringConceptPart4 {

	public static void main(String[] args) {
		
		String s1 = new String("DURGA");
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		
		System.out.println(s1==s2); //True
		System.out.println(s1==s3); //False
		
		System.out.println("***");
		
		String s4 = "maitri";
		String s5 = s4.toString(); //true
		
		String s6 = s4.toLowerCase();
		String s7 = s4.toUpperCase();
		
		System.out.println(s4==s5); //true
		System.out.println(s4==s6); //true
		System.out.println(s4==s7); //false
		
		

	}

}
