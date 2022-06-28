package multiThreading_Concept;

public class MultiThreadJoinConceptPart3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("DeadLock Starting");
		
		Thread.currentThread().join();
		
		System.out.println("DeadLock");
		
		//Dead - Lock Stiuation 

	}

}
