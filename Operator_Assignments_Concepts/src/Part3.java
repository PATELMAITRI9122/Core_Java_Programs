
public class Part3 {

	public static void main(String[] args) {
		
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		
		//System.out.println(t instanceof String); //CE - incompatible types
		
		System.out.println(null instanceof Runnable); //false
		System.out.println(null instanceof Object); //false
		System.out.println(null instanceof Thread); //false
		System.out.println(null instanceof Integer); //false
		
		int x = 10;
		//System.out.println(x instanceof Integer);
		
		System.out.println("*****");
		
		System.out.println(true & false); //false
		System.out.println(true | false); //true
		System.out.println(true ^ false); //true
		
		System.out.println(4&5); //4
		System.out.println(4 | 5); //5
		System.out.println(4 ^ 5); //1
		
		//System.out.println(4.5 & 5);
		
		System.out.println(~-8);
		System.out.println(~4 & ~5);
		
		System.out.println(!false);
		//System.out.println(!null);

	}

}
