package String_Concept;

public class SolutionToDeadLockSituation {
	
	public static void main(String[] args) {
		
		final Resource1 obj1 = new Resource1();
		final Resource2 obj2 = new Resource2();
		
		//first thread -> lock obj2
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				synchronized (obj2) {
					
					try {
						Thread.sleep(100);
						System.out.println("Thread 1 lock obj2 - but sleep method run");
					}catch (Exception e) {e.printStackTrace();}
					
					synchronized (obj1) {
						System.out.println("Thread 1 lock obj1");
					}
				}
				
			}
		};
		
		Runnable r2 = new Runnable() {
			//Thread 2 -> Lock Obj2
			@Override
			public void run() {
				synchronized (obj2) {
					synchronized (obj1) {
						System.out.println("Thread2 inside lock of Resource obj2");
						
					}
				}
				
				
			}
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
		
	}

}

 class Resource1{
	private int i =10;
	public int getInt() {
		return i;
	}
	public void setInt(int i) {
		this.i = i;
	}
}
 
 class Resource2{
	 private int i = 20;
	 public int getInt() {
		 return i;
	 }
	 public void setInt(int i) {
		 this.i = i;
	 }
	 
	 
 }
