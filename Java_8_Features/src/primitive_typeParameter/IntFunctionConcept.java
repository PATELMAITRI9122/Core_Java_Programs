package primitive_typeParameter;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionConcept {
	
	public static void main(String[] args) {
		
		IntFunction<Integer> f = i->i*i;
		System.out.println(f.apply(4));
		
		//Function<String, Integer> f1 = s -> s.length();
		ToIntFunction<String> f2 = s -> s.length();
		
		System.out.println(f2.applyAsInt("Brijesh"));
		
		System.out.println("****");
		//Function<Integer, Double> f3 = i -> Math.sqrt(i);
		IntToDoubleFunction f3 = i->Math.sqrt(i);
		System.out.println(f3.applyAsDouble(16));
	}

}
