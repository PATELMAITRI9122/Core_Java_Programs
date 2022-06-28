package String_Concept;

public class TestDeaLockExample {
	
	public static void main(String[] args) {
		
		final String resource1 = "Resource1";
		final String resource2 = "Resource2";
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1: locked Resource1");
					
					//getting Thread Sleep
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//Giving Lock to other Resource2
					synchronized (resource2) {
						System.out.println("Thread1: Locked Resource2");
					}
					
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2 Lock On Resource2");
					
					//getting Thread Sleep
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//getting lock on Resource1
					synchronized (resource1) {
						System.out.println("Thread2: Resource1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
