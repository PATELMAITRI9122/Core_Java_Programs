package multiThreading_Concept;

public class ThreadConceptPart2 {

	public static void main(String[] args) {
		
		mmyThread t = new mmyThread();
		t.start();
	//	t.run();
		System.out.println("Main Thread");
		

	}

}

class mmyThread extends Thread{
	
	@Override
	public synchronized void start() {
		super.start(); // No specified execution flow
		System.out.println("Start Method");
		run();
	}
	
	@Override
	public void run() {
		System.out.println("RUn Method");
	}
	
	public void run(int i) {
		System.out.println("Helllo i");
	}
	
}
