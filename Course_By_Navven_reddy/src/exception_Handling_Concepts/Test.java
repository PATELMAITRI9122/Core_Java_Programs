package exception_Handling_Concepts;

public class Test {

	public static void main(String[] args) {
		
		doStuff();
		System.out.println(10/0);

	}
	
	public static void doStuff() {
		doMoreStuff();
	//	System.out.println(10/0);
		System.out.println("Hii");
	}
	
	public static void doMoreStuff() {
		//System.out.println(10/0);
		System.out.println("Hello");
	}

}
