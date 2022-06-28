package multiThreading_Concept;

public class MultiThreadJoinConceptPart1 {

	public static void main(String[] args) throws InterruptedException {

		yeld2.t = Thread.currentThread();

		yeld2 thread = new yeld2();

		thread.start();
		thread.join();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread: " + i);
			Thread.sleep(2000);
		}

	}

}

class yeld2 extends Thread {

	static Thread t;

	@Override
	public void run() {

		try {
			t.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		for(int i =0; i<5; i++)
			System.out.println("Child Thread: " + i);

	}

}
