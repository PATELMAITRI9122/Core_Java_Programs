package functional_inteface_concept;

import java.util.function.Consumer;

public class Consumer_Concept {

	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Maitri");
		c.accept("patel");
				
	}
}
