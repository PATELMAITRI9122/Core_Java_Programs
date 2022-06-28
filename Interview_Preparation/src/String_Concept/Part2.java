package String_Concept;

public class Part2 {
	
	public static void main(String[] args) {
		
		System.out.println(removeChar("Maitri", 'a'));
		
		String name = "Maitri";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		char[] array = name.toCharArray();
		
		for(char c: array) {
			System.out.println(c);
		}
		
		byte[] barray = name.getBytes();
		for(byte b: barray) {
			System.out.println(b);
		}
		
	}
	
	private static String removeChar(String str, char c) {
		
		if(str.equals(null))
			return null;
		
		return str.replaceAll(Character.toString(c), "");
		
	}

}
