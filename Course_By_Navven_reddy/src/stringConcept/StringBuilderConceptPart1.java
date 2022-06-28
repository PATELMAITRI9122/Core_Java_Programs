package stringConcept;

public class StringBuilderConceptPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		sb.append("Durga").append("Solutions").reverse().insert(0, "D").delete(0, 1);
		System.out.println(sb);

		StringBuilder str1 = new StringBuilder("Durga");
		String str2 = str1.toString();
		
		String str3 = str2;
		
		System.out.println(str2==str3);

//		if (sb2.equals(s))
//			System.out.println("Match1");
//		else if (sb2.toString().equals(s.toString()))
//			System.out.println("Match 2");
//
//		else
//			System.out.println("No Match");
		
		System.out.println("***");
		System.out.println(str1);
		str1.delete(0, str1.length());
		System.out.println(str1);
		
		

	}

}
