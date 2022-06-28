package revision_concept;

public class Reverse_String {

	public static void main(String[] args) {

		String str = "MAITRI";

		System.out.println(reverseString(str));

	}

	public static String reverseString(String str) {

		if (str == null) {
			throw new IllegalArgumentException();
		} else {
			char[] character = str.toCharArray();
			StringBuilder sb = new StringBuilder();

			for (int i = character.length - 1; i >= 0; i--) {
				sb.append(character[i]);
			}

			return sb.toString();

		}

	}

}
