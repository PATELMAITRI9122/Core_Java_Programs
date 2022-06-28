
public class StringImmutableConcept {
	
	public static void main(String[] args) {
		
		String s1 = "java";
		
		String s2 = s1;
		
		System.out.println(s1 == s2); //same refrence
		
		s1 = "Python";
		
		System.out.println(s1==s2);
		System.out.println(s2);
		System.out.println(s1);
	}

}
