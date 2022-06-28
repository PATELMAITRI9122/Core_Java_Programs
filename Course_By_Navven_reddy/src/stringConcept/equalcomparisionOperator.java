package stringConcept;

public class equalcomparisionOperator {

	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");

		System.out.println(s1 == s2); //false

		System.out.println(s1.equals(s2)); //true

		StringBuffer sb1 = new StringBuffer("HELLO");
		StringBuffer sb2 = new StringBuffer("HELLO");

		System.out.println(sb1 == sb2); //false

		System.out.println(sb1.equals(sb2)); //false

	}

}
