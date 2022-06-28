package multiThreading_Concept;

public class ThreadConceptPart5 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()); //main
		te t = new te();
		t.start();
		
		System.out.println("This line created by: " + Thread.currentThread().getName()); //main
	
//		System.out.println(t.getName()); //Thread -0
//		Thread.currentThread().setName("Maitri");
//		System.out.println(Thread.currentThread().getName()); // main thread -> name -> set as -> Maitri
//		System.out.println(10/0);

	}

}

class te extends Thread{
	
	@Override
	public void run() {
		System.out.println("This line creadted by: " + Thread.currentThread().getName()); //Thread -0 
	}
	
	
}
