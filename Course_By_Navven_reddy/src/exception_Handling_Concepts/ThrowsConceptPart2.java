package exception_Handling_Concepts;

import java.io.IOException;

public class ThrowsConceptPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//throw new Exception(); -> this because we haven't declare throws keyword -> checked -> have to handle -> compile time error
	//	throw new Error(); //-> This will give runtime error -> unchecked 
		
		try {
			System.out.println("Hello");
			
		}catch(InterruptedException e) {
			
		}

	}

}
