package multiThreading_Concept;

public class ThreadConceptPart1 {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
	//	t.start();
		t.run();
		
		for(int i = 0; i <=5 ; i++) {
			System.out.println("Main Thread: " + i);
		}
		

	}

}

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0; i <=5 ; i++) {
			System.out.println("Child Thread: " + i);
		}
		
	}
	
}
