
public class Part2 {

	public static void main(String[] args) {
		
		int x=10;
		final int y = 20;
		
		switch(x) {
		
		case 10: 
			System.out.println("Hello");
			break;
		case y:
			System.out.println("Bye");
			break;
			
		}
		
		switch(x+1) {
		case 10+20+30:
			System.out.println("Valid");
			break;
		case y: 
			System.out.println("Not valid");
			break;
		}
		
		byte b = 10;
		switch (b+1) {
		case 10:
			System.out.println("Hello");
			break;
		case 100:
			System.out.println("VVVV");
			break;
		case 1000:
			System.out.println("Not valid");
		
		}
		
		switch (x) {
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		case 96: 
			System.out.println("HHHH");
		case 'a':
			System.out.println("wwwww");
//		case 97:
//			System.out.println("duplicate");
		
		}

	}

}
