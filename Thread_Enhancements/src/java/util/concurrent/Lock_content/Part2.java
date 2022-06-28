package java.util.concurrent.Lock_content;

import java.util.concurrent.locks.ReentrantLock;

public class Part2 {

	public static void main(String[] args) {
		
		Display d = new Display();
		MyThread t1 = new MyThread(d, "AAA");
		MyThread t2 = new MyThread(d, "BBB");
		MyThread t3 = new MyThread(d, "CCC");
		
		t1.start();
		t2.start();

	}

}

class Display{
	
	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name) {
		l.lock();
		for(int i =0; i<10;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		l.unlock();
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}