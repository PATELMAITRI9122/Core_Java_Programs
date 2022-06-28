package stringConcept;

public class equalsandoperatorcomparison {

	public static void main(String[] args) {
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false
		
		//System.out.println(s1==sb1); -> Incompatible Type Exception
		System.out.println(s1.equals(sb1)); //false
		
		// SAME HASHCODe
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		
		System.out.println("******");
		
		//DIFFERENT HASHCODE 
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());

	}

}
