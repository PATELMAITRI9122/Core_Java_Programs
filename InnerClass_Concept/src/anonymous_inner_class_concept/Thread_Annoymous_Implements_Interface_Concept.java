package anonymous_inner_class_concept;

public class Thread_Annoymous_Implements_Interface_Concept {

	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable()
//		Thread t = new Thread(r);
//		t.start();
//		for(int i=0;i<5;i++) {
//			System.out.println("Main-Thread");
//		}

		/*
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Child-Thread");
				}

			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main-Thread");
		}*/
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=0;i<5;i++) {
					System.out.println("Child-Thread");
				}
				
			}
		}).start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main-Thread");
		}
		
	}
}

/*
 * 
 * Normal Approach class MyRunnable implements Runnable{
 * 
 * @Override public void run() { // TODO Auto-generated method stub
 * 
 * for(int i =0; i<5;i++) { System.out.println("Child-Thread"); }
 * 
 * }
 * 
 * }
 */
