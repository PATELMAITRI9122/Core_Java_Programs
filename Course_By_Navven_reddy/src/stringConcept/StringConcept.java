package stringConcept;

public class StringConcept {

	public static void main(String[] args) {
		
		String s = new String("Maitri");
		
		s.concat("Hello"); // this will not print because it does not have any references 
		s = s.concat("Hello"); // this will print because refrences is assigned
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Maitri");
		sb.append("Hello");
		System.out.println(sb);
		

	}

}
