package deadlock_concept;

public class Deamon_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Thread: " + Thread.currentThread().isDaemon());
	//	Thread.currentThread().setDaemon(true); // RUNTIME EXCEPTION: IllegalThreadStateException
		
		mt th = new mt();
		System.out.println(th.currentThread().isDaemon()); // False
		th.setDaemon(true);
		System.out.println(th.isDaemon()); //True
		
		

	}

}

class mt extends Thread{
	
}
