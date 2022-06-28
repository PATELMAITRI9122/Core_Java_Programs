package thread_pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Part1 {

	public static void main(String[] args) {

		MyRunnable[] object = { new MyRunnable("AAA"), new MyRunnable("BBB"), new MyRunnable("CCC"),
				new MyRunnable("DDD"), new MyRunnable("EEE") };
		
		ExecutorService service = Executors.newFixedThreadPool(5);

		for (MyRunnable object1 : object) {
			service.submit(object1);
		}
		
		service.shutdown();

	}

}

class MyRunnable implements Runnable {

	String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + ".... Job Started By Thread" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(name + ".... Job Completed By Thread" + Thread.currentThread().getName());

	}

}
