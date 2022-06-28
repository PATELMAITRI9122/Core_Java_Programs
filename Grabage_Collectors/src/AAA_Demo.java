
public class AAA_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		String a = new String("AAA");
		String b = new String("AAA");
		
		System.out.println(a.equals(b)); //true
		
		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("AAA");
		
		System.out.println(sb1.equals(sb2)); //false
		
		System.out.println(a.equals(sb1)); //false
		
		StringBuilder sb11 = new StringBuilder("AAA");
		StringBuilder sb12 = new StringBuilder("AAA");
		
		System.out.println(sb11.equals(sb12)); //false
		System.out.println(sb11.equals(sb1)); //false
		
		String a1 = "BBB";
		String b1 = "BBB";
		
		//StringBuffer sq1 = "AAA";
		

	}

}
