package thread_group;

public class Part2 {

	public static void main(String[] args) throws Exception {
		
		ThreadGroup tg1 = new ThreadGroup("ParentGroup");
		ThreadGroup tg2 = new ThreadGroup(tg1,"childGroup"); // ParentGroup -> ChildGroup
		
		MyThread t1 = new MyThread(tg1, "childThread1");
		MyThread t2 = new MyThread(tg1, "childThread2");
		
		t1.start();
		t2.start();
		
		System.out.println(tg1.activeGroupCount()); //1 -> number of thread group
		System.out.println(tg1.activeCount()); //2 -> total thread inside thread group
		tg1.list();
		
		Thread.sleep(10000);
		System.out.println(tg1.activeCount()); // 0
		System.out.println(tg1.activeGroupCount()); //1
		tg1.list();
		
		MyThread t3 = new MyThread(tg2, "childThread3");
		MyThread t4 = new MyThread(tg2, "childThread4");
		
		t3.start();
		t4.start();
		
		System.out.println(tg2.activeGroupCount()); //0 -> number of thread group
		System.out.println(tg2.activeCount()); //2 -> total thread inside thread group
		tg2.list();

		
	}

}

class MyThread extends Thread{
	
	public MyThread(ThreadGroup tg, String name) {
		super(tg,name);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			System.out.println(e.getStackTrace());
		}
	}
	
}
