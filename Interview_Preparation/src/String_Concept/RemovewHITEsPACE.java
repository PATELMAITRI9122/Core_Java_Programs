package String_Concept;

public class RemovewHITEsPACE {
	
	public static void main(String[] args) {
		
		System.out.println(remove_white_space("Hello Maitri"));
	}
	
	public static String remove_white_space(String str) {
		
		if(str == null) {
			throw new IllegalArgumentException();
		}
		
		char[] character = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : character) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
		
		
		
	}

}
