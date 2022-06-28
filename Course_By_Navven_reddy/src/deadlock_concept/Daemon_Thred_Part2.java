package deadlock_concept;

public class Daemon_Thred_Part2 {

	public static void main(String[] args) {
		
		tt th = new tt();
		th.setDaemon(true);
		th.start();
		System.out.println("End Of Main Thread");

	}

}

class tt extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Cild Thread: " + i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
