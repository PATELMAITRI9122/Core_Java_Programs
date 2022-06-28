package inner_multithreading_concept;

public class Part2 {

	public static void main(String[] args) throws InterruptedException {
		ThreadA1 th = new ThreadA1();
		th.start();
		
		Thread.sleep(10000);
		
		synchronized (th) {
			System.out.println("Main Thread trying to call wait method");
			//th.wait(); //Main thread will enter into wait state forever
			th.wait(10000);
			System.out.println("Main Thread get Notification");
			System.out.println(th.total);
		}
	}

}

class ThreadA1 extends Thread{
	
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("Child thread start for calculation");
			
			for(int i = 0; i<=8; i++) {
				total = total + i;
			}
			
			System.out.println("Notification from Child Thread");
			this.notify();
		}
		
	}
	
}
