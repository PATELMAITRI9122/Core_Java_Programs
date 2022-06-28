package primitive_typeParameter;

/**
 * 
 */
import java.util.function.IntPredicate;

public class IntPredicateConcept {
	public static void main(String[] args) {
		
		int a[] = {0,5,10,20,30};
		
		IntPredicate p = i ->i%2==0;
		
		for(int x1 : a) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
			
		}
	}

}
