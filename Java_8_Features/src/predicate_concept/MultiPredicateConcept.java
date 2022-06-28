package predicate_concept;

import java.util.function.Predicate;

public class MultiPredicateConcept {
	
	public static void main(String[] args) {
		
		// check whether the number is even or not - predicate1
		//check the whether the number is > 10 or not - predicate2
		
		int[] x = {0,1,5,10,5,4,6,15,20,30,40};
		Predicate<Integer> pre1 = y -> y%2==0;
		Predicate<Integer> pre2 = y -> y>10;
		
		//and, or , negate()
		System.out.println("The number are even and > 10: ");
		for(int x1:x) {
			if(pre1.and(pre2).test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("****");
		
		System.out.println("The number are even or >10: ");
		for(int x1: x) {
			if(pre1.or(pre2).test(x1)) {
				System.out.println(x1);
			}
		}
		
		System.out.println("***");
		System.out.println("The number are not even: ");
		for(int x1: x) {
			if(pre1.negate().test(x1)) {
				System.out.println(x1);
			}
		}
		
	}

}
