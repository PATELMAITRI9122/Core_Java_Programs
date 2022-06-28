package multiThreading_Concept;

public class MultiThreadingIntrruptMethodConcept1 {

	public static void main(String[] args) {

		IntrruptMethod th = new IntrruptMethod();
		th.start();

		th.interrupt(); // Main thread -> Interrupt -> Child Thread

		System.out.println("End of main");

	}

}

class IntrruptMethod extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("I am Lazy Thread!" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Intrrupted.");
		}
	}

}
