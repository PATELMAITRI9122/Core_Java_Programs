package String_Concept;

public class Vowel {
	
	public static void main(String[] args) {
		
		System.out.println(checkVowel("Hello"));
		System.out.println(checkVowel("bbb"));
		
		
	}

	public static boolean checkVowel(String str) {
		
		return str.toLowerCase().matches(".*[aeiou].*");
	}
}
