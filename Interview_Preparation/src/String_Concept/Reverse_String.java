package String_Concept;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		//String str = "MAITRI";
		
		System.out.println(reverse("MAITRI"));
		
		
	}
	
	public static String reverse(String str) {
	
		if (str == null) {
			System.out.println("String is Empty!");
			throw new IllegalArgumentException();
		}else {
			
			StringBuilder sb = new StringBuilder();
			
			char[] r_char = str.toCharArray();
			for(int i = r_char.length-1; i>=0; i--) {
				sb.append(r_char[i]);
			}
			
			return sb.toString();
		}
	}

}
