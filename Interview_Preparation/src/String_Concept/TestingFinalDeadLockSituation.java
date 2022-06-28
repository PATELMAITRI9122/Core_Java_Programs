package String_Concept;

public class TestingFinalDeadLockSituation {

	public static void main(String[] args) {

		// 1st Step: Create 2 Resources
		// 2nd Step: Create 1st Thread
			// give lock on resource1 -> thread1
			// Thread1 -> go on sleep mode
			// give Thread1 lock -> Resource2
		//3rd Step: Create 2nd Thread
			//give lock on Resource2 -> Thread2
			//Thread2 -> go on sleep
			//Thread2 -> try to get lock on resource1

		String respurce1 = "Resource1";
		String resource2 = "Resource2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (respurce1) {
					System.out.println("Thread1:Resource1");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (resource2) {
						System.out.println("Thread1: Resource2");
					}
				}
			};
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2: Resource2");
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (respurce1) {
						System.out.println("Thread2: Resource1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
