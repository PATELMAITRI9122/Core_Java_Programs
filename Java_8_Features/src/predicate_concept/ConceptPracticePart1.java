package predicate_concept;

import java.util.function.Predicate;

public class ConceptPracticePart1 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p1 = i -> i%2==0;
		System.out.println(p1.test(15));
		System.out.println(p1.test(20));
		
		System.out.println("****");
		
		Predicate<String> p = s->s.length()>5;
		System.out.println(p.test("MAITRI"));
		
		System.out.println("****");
		
		//Print the string which length is even using predicate
		
		String[] s1 = {"Maitri","harsh","Brijesh","Anjali"};
		Predicate<String> pre = s->s.length()%2==0;
		
		for(String s2 : s1) {
			if(pre.test(s2)) {
				System.out.println(s2);
			}
		}
	
	}

}
