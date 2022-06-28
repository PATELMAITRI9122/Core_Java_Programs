package multiThreading_Concept;

public class ThreadConceptPart4 {

	public static void main(String[] args) {
		mt t = new mt();
		t.start();
		
		System.out.println("Trying to call Thread again");
		
		t.start(); // This will give exception because we are again trying to start thread as we have already start before

	}

}

class mt extends Thread{

	@Override
	public void run() {
		System.out.println("Helllo");
	}
}
