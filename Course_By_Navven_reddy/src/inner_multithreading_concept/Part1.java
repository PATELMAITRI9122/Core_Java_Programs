package inner_multithreading_concept;

public class Part1 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadA th = new ThreadA();
		th.start();
		
		// CAN NOT EXPECT WHICH THREAD WILL EXECUTE FIRST
		
		//MAIN THREAD EXPECTING SOME UPDATION
		
		//Thread.sleep(0,1); // NOT RECOMMENDED
		
		//th.join(); // NOT RECOMMENDED
		
		//BEST OPTIONS ARE -> wait(), notify(), notifyAll()
		
		th.wait();
		
		System.out.println(th.total);
	}

}

class ThreadA extends Thread{
	int total =0;
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			total = total + i; 
		}
		this.notify();	
	}
}
