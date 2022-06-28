package multiThreading_Concept;

public class MultiThreadJoinConcept {

	public static void main(String[] args) throws InterruptedException {
		
		JoinConcept th = new JoinConcept();
		
		th.start();
		
		th.join(1000);
		
		for(int i =0; i<5;i++) {
			System.out.println("XXXX Thread");
		}

	}

}

class JoinConcept extends Thread {

	@Override
	public void run() {
		
		for(int i = 0; i<5;i++) {
			System.out.println("Child Thread: " +i);
			try {
				Thread.sleep(10000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
