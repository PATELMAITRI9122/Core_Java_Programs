package multiThreading_Concept_Synchronization;

public class Part2 {

	public static void main(String[] args) {
		
		Display1 d = new Display1();
		
		mw th1 = new mw(d);
		mw2 th2 = new mw2(d);
		th1.start();
		th2.start();
		

	}

}

class Display1{
	public synchronized void display() {
		for(int i = 0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				
			}
		}
	}
	
	public synchronized void displayC() {
		
		for(int i = 65; i<75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
		}
		
	}
	
}

class mw extends Thread{
	Display1 d;
	
	mw(Display1 d){
		this.d = d;
		
	}
	
	@Override
	public void run() {
		d.display();
	}
	
}

class mw2 extends Thread{
	Display1 d;
	mw2(Display1 d){
		this.d = d;
	}
	@Override
	public void run() {
		d.displayC();
	}
}


