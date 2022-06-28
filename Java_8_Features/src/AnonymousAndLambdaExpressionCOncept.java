
public class AnonymousAndLambdaExpressionCOncept {

	public static void main(String[] args) {
		
		//Creating An Anonymous Inner Class
		/*Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i=0; i<5; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		*/
		
		Runnable r = () -> {
			for(int i =0; i<5; i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
		
		
	}
}
