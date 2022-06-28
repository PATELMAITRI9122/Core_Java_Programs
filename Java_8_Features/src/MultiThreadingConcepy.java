
public class MultiThreadingConcepy  {

	public static void main(String[] args) {
		
		Test thread = new Test();
		Thread th = new Thread(thread);
		th.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
	
}

class Test implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Child Thread");
		}
		
	}
}
