package thread_group;

public class Part1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main 
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system 
		
		ThreadGroup g1 = new ThreadGroup("first-Group");
		System.out.println(g1.getParent().getName()); //main 
		
		ThreadGroup g2 = new ThreadGroup(g1,"Second-thread");
		System.out.println(g2.getParent().getName()); //first-group
		
		System.out.println("*****");
		
		ThreadGroup tg1 = new ThreadGroup("Tg-1");
		Thread t1 = new Thread(tg1,"first-thread");
		Thread t2 = new Thread(tg1,"second-thread");
		tg1.setMaxPriority(3);
		
		Thread t3 = new Thread(tg1,"three-thread");
		System.out.println(t1.getPriority()); //5 -> because before setting the priority thread already add
		System.out.println(t2.getPriority()); //5 -> same
		System.out.println(t3.getPriority()); // 3 -> after setting thread priority change with threadgroup priority
	
	}

}
