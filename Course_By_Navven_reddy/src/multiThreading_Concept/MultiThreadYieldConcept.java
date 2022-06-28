package multiThreading_Concept;

public class MultiThreadYieldConcept {

	public static void main(String[] args) {

		yeildThread th = new yeildThread();
		th.start();
		
//		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
//		System.out.println("Child Thread Priority: " + th.getPriority());
//		th.setPriority(3);
//		System.out.println("Changed Child Thread Priority: " + th.getPriority());

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread: " + i);
		}

	}

}

class yeildThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("child Thread: " + i);
			Thread.yield(); // this will give chance more to main thread
		}
	}

}
