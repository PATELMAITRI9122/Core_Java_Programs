package exception_Handling_Concepts;

public class CustomizedException {

	public static void main(String[] args) {
		
		System.out.println("TRY - CATCH");
		
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			e.printStackTrace(); // Exception Name: Description : StackTrace Information
			System.out.println(e.toString()); //Name of exception: description
			//System.out.print(e.printStackTrace());
			System.out.println(e.getMessage()); //ONLY description
			System.out.println(10/2);
		}
		
		System.out.println("GRACEFUL EXECUTION");
		
		try {
			
		}catch(Exception e) {
			try {
				
			}catch (Exception e1) {
				// TODO: handle exception
			}
		}finally {
			try {
				
			}catch (Exception e) {
				// TODO: handle exception
			}finally {
				
			}
		}
		
//		try
//			System.out.println("Hello");
//		catch (Exception e) {
//			// TODO: handle exception
		}

	}

}
