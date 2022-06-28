package String_Concept;

public class Part1 {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(" ASD"));
	}
	
	private static boolean isPalindrome(String str) {
		
		if(str.equals(null))
			return false;
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return sb.toString().equals(str);
		
	}

}
