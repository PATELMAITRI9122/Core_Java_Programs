public class LambdaExpressionUsingRunnableInterface {
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for(int i = 0; i<5; i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
		for(int i = 0; i<5; i++) {
			System.out.println("main Thread");
		}
	}

}
