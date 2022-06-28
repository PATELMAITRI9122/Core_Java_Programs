package functional_inteface_concept;

import java.util.function.Function;

public class PArt1 {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(24));
		System.out.println("***");
		//string as an argument and return the length of the string
		
		Function<String, Integer> f1 = s -> s.length();
		System.out.println(f1.apply("MAITRI"));
		
		System.out.println("***");
		Function<String, String> f3 = s -> s.toUpperCase();
		System.out.println(f3.apply("brijesh"));
	}

}
