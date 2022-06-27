package tutorial_3;

public class finalExample {
	
	//final vale can not be change futher in the program it always remain same such as PI = 3.14
	//Final variable can not be override and can not be inherited 
	
	private int sum;
	private final int NUMBER;
	
	public finalExample(int x) {
		// TODO Auto-generated constructor stub
		
		NUMBER = x;
	}
	
	public void add() {
		sum+=NUMBER;
	}
	
	public String toString() {
		return String.format("Sum = %d\n", sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalExample object = new finalExample(10);
		
		for(int i =0; i<5; i++) {
			object.add();
			System.out.printf("%s",object);
		}
		
	}

}
