package multiThreading_Concept;

public class RunnableIntefaceConceptPart1 {

	public static void main(String[] args) {
		
		myRunnable r = new myRunnable();
		Thread t =new Thread(r);
		t.start();
		System.out.println("Main Thread");

	}

}

class myRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Runnable Run Method");
		
	}
	
}
