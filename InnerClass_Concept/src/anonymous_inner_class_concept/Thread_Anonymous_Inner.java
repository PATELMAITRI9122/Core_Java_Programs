package anonymous_inner_class_concept;

public class Thread_Anonymous_Inner {
	
	public static void main(String[] args) {
		
		Thread t = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Child-Thread");
				}
			}
		};
		t.start();
		for(int i =0; i<10; i++) {
			System.out.println("Main-Thread");
		}
		
	}

}


