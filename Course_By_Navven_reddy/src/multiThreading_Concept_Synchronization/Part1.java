package multiThreading_Concept_Synchronization;

public class Part1 {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		tt thread = new tt(d1,"DHONI");
		tt thread2 = new tt(d2,"VIRAT");
		//tt thread4 = new tt(d,"Raina");
		//tt thread3 = new tt(d,"Yuvi");
		//d.wish("DHONI");
		thread.start();
		thread2.start();
//		thread3.start();
//		thread4.start();
	}

}

class Display {

	public static synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" " + name);
		}
	}

}

class tt extends Thread {

	Display d;
	String name;

	tt(Display d, String name) {
		this.d = d;
		this.name = name;

	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}
