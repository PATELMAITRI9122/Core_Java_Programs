package exception_Handling_Concepts;

public class ThrowConceptPart1 {

	public static void main(String[] args) throws InterruptedException {

		doStuff();
		
		Test1 t1 = new Test1();

	}

	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(1000);
	}

}

class Test1{
	Test1() throws InterruptedException {
		
	}
	
	public void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
}
