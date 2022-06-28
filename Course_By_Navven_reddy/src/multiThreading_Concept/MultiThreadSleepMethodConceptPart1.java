package multiThreading_Concept;

public class MultiThreadSleepMethodConceptPart1 {

	public static void main(String[] args) throws InterruptedException {
		
		//MultiThreadSleepMethodConceptPart1
		
		for(int i = 0; i<5; i++) {
			System.out.println("Hello: " +i);
			Thread.sleep(5000);
		}

	}

}


