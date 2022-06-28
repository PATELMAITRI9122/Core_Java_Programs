package String_Concept;

public class CreationOfDeadlockProgramatically {

	public static void main(String[] args) throws InterruptedException {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		Thread thread1 = new Thread(new dead(obj1, obj2),"t1");
		Thread thread2 = new Thread(new dead(obj2, obj3),"t2");
		Thread thread3 = new Thread(new dead(obj3, obj1),"t3");
		
		thread1.start();
		//run method
		Thread.sleep(50000);
		thread2.start();
		Thread.sleep(50000);
		thread3.start();
		Thread.sleep(50000);

	}

}

class dead implements Runnable {

	private Object obj1;
	private Object obj2;

	public dead(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " acquiring lock on " + obj1);

		// give an lock to object1
		synchronized (obj1) {
			System.out.println(name + " acquired lock on " + obj1);
			//obj1 go to sleep
			work();
			
			//obj2 get the lock
			System.out.println(name + "acquiring lock on: "+obj2);
			synchronized (obj2) {
				System.out.println(name + "acquired lock on: " + obj2);
				work();
			}	
		}
		System.out.println(name + "released lock on: "+obj2);
		System.out.println("finished execution");
	}
	
	private void work() {
		try {
			Thread.sleep(30000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
