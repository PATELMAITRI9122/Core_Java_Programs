package bi_functional_interface_concept;

import java.util.function.BiPredicate;

public class Bi_Predicate_Concept {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> biPredicate = (a,b) -> (a+b)%2 == 0;
		System.out.println(biPredicate.test(15, 20));
	}

}
