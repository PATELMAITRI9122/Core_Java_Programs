package thread_pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Part2 {

	public static void main(String[] args) throws Exception {
		
		//MyCallable mc = new MyCallable(10);
		MyCallable[] jobs = {new MyCallable(10),
				new MyCallable(15),
				new MyCallable(20),
				new MyCallable(25),
				new MyCallable(30),
				new MyCallable(35),
				new MyCallable(40)};
		
		ExecutorService service = Executors.newFixedThreadPool(7);
		
		for(MyCallable job: jobs) {
			Future f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();

	}

}

class MyCallable implements Callable{

	int num;
	
	public MyCallable(int num) {
		this.num = num;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() + "... is responsible to find sum of first" + num +" numbers ");
		
		int total = 0;
		for(int i =0;i<=num;i++) {
			total = total + i;
		}
		return total;
	}
	
}