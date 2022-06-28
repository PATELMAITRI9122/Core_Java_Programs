
public class synchronizedPrac {

	public static void main(String[] args) {

		Sender send = new Sender();
		ThreadedSend s1 = new ThreadedSend("HI", send);
		ThreadedSend s2 = new ThreadedSend("Bye", send);

		s1.start();
		s2.start();

	}

}

class Sender {

	public void send(String msg) {
		System.out.println("Sending: " + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Intruppted");
		}
		System.out.println("\n" + msg + "Sent");
	}

}

class ThreadedSend extends Thread {

	private String msg;
	Sender sender;

	public ThreadedSend(String msg, Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}

	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}

}