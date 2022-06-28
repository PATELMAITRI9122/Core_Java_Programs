package methodAndConstructorRefrenceConcept;

public class ThreadDefiningUsingLambdaExpressionConcept {
	
	private  int m1() {
		for(int i = 0; i<5; i++) {
			System.out.println("Child Thread");
		}
		
		return 10;
	}
	
	
	public static void main(String[] args) {
		
	//	Runnable r = ThreadDefiningUsingLambdaExpressionConcept :: m1;
		
		ThreadDefiningUsingLambdaExpressionConcept t1 = new ThreadDefiningUsingLambdaExpressionConcept();
		Runnable r = t1 :: m1;
		
		Thread th = new Thread(r);
		th.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Main Thread");
		}
				
		
	}

}
