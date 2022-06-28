package primitive_typeParameter;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class BinaryOperatorConcept {
	
	public static void main(String[] args) {
		
		BiFunction<String, String, String> bf = (s1,s2) -> s1+s2;
		System.out.println(bf.apply("Maitri ", "Patel"));
		
		System.out.println("****");
		
		//Can use BinaryOperator
		BinaryOperator<String> bo = (s1,s2) -> s1+ s2;
		System.out.println(bo.apply("Brijesh ", "Vanakawala"));
		
		BinaryOperator<Integer> bo1 = (i1,i2) -> i1+ i2;
		System.out.println(bo1.apply( 10, 20));
		
		System.out.println("*****");
		
		//Can use Primitive BinaryOperator Function
		IntBinaryOperator ibo = (s1,s2) -> s1+ s2;
		System.out.println(ibo.applyAsInt(20, 30));
		
		System.out.println("*****");
		
		//Program Requirement: Increment the value -> sequare of the incremented value using Unary Operator
		
		IntUnaryOperator iuo = i -> i+1;
		System.out.println(iuo.applyAsInt(4));
		
		IntUnaryOperator iuo2 = i -> i*i;
		System.out.println(iuo2.applyAsInt(4));
		
		System.out.println("****");
		System.out.println(iuo.andThen(iuo2).applyAsInt(4));
		
		
		
		
	}

}
