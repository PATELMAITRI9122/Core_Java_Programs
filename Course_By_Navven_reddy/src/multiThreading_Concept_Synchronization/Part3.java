package multiThreading_Concept_Synchronization;

public class Part3 {

	public static void main(String[] args) {

		Ddisplay d = new Ddisplay();
		Ddisplay d1 = new Ddisplay();

		wthread th = new wthread(d, "DHONI");
		wthread th1 = new wthread(d1, "YUVI");

		th.start();
		th1.start();

	}

}

class Ddisplay {

	public void wish(String name) {
		//System.out.println("Good Morning");
		synchronized (Ddisplay.class) {

			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}

	}
}

class wthread extends Thread {

	Ddisplay d;
	String name;

	wthread(Ddisplay d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}

}