package thread_local;

public class Part2 {

	public static void main(String[] args) {
		
		CustomerThread ct1 = new CustomerThread("Customer Thread 1");
		CustomerThread ct2 = new CustomerThread("Customer Thread 2");
		CustomerThread ct3 = new CustomerThread("Customer Thread 3");
		CustomerThread ct4 = new CustomerThread("Customer Thread 4");
		
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		
		

	}

}

class CustomerThread extends Thread{
	
	static Integer custId = 0;
	String name;
	
	private static ThreadLocal tl = new ThreadLocal() {
		protected Object initialValue() {
			return ++custId;
		}
	};
	
	
	public CustomerThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "..." + tl.get());
	}
	
}
