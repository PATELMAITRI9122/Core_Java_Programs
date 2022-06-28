
public class Vowel_Check {
	
	public static void main(String[] args) {
		
		System.out.println(stringVowelCheck("Hello"));
		System.out.println(stringVowelCheck("TV"));
	}
	
	public static boolean stringVowelCheck(String str) {
		
		return str.toLowerCase().matches(".*[aeiuou].*");
		
	}

}
