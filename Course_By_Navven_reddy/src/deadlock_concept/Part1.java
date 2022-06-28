package deadlock_concept;

public class Part1 extends Thread {
	
	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start(); // Main Thread -> after this child thread will create
		a.d1(b);
	}
	
	@Override
	public void run() { // This run method -> Run -> Child Thread		
		b.d2(a);
	}

	public static void main(String[] args) {

		Part1 th = new Part1();
		th.m1();

	}

}

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 start execution of d1() method ");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Thread1 trying to call last() method from B's Class");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Invalid; Class A's Last Method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread2 start execution of d2() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Thread2 trying to call last() method from A's Class");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Invalid; Class B's Last Method");
	}
}