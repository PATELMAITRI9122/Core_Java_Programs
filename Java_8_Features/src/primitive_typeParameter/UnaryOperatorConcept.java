package primitive_typeParameter;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {
	
	public static void main(String[] args) {
		
		
		//Where input argument and return type both same type
		// child class of Function
		IntUnaryOperator uf = i -> i*i;
		System.out.println(uf.applyAsInt(6));
		
		DoubleUnaryOperator duo = i -> i*i;
		System.out.println(duo.applyAsDouble(6.6));
	}

}
