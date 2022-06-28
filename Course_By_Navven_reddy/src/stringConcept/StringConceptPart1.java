package stringConcept;

public class StringConceptPart1 {

	public static void main(String[] args) {
		
		String s1 = new String("Spring"); //this have reference
		s1.concat("Fall");
		
		String s2 = s1.concat(" Winter"); // s2 = spring winter 
		s2.concat("Summer");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
