package exception_Handling_Concepts;

public class ThrowConcept {

	//static ArithmeticException ex = new ArithmeticException();
	
	public static void main(String[] args) throws  InterruptedException{
		
	//	throw new ArithmeticException("Division by Zero"); //creation of object explicitly -> handover our created object to JVM manually
		
		/*
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Hello"); //does not compile
		}*/
		
		Thread.sleep(1000);
		

	}

}
