
public class Part1 {

	public static void main(String[] args) {
	
	/*	int x = 10;
		int y = ++x;
		System.out.println(y);*/
		
	/*	int x = 10;
		int y = ++10;*/
		
		/*int x = 10;
		int y = ++(++x); //Compile time error // int y = ++11 -> Compile time error
		System.out.println(y);*/
		
	/*	final int x = 10;
		x = 11;
		System.out.println(x);*/
		
	/*	final int x = 10;
		int y = ++x;
		System.out.println(y);*/
		
		int x = 10;
		x++;
		System.out.println(x);
		
		char ch = 'a';
		ch++;
		System.out.println(ch);
		
		double d = 10.5;
		d++;
		System.out.println(d);
		
		/*boolean b = true;
		b++;
		System.out.println(b);*/
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		System.out.println(c);
		
		byte b1 = 10;
		b1 = (byte)(b1+1);
		System.out.println(b1);

		System.out.println("*****");
		System.out.println('a' + 'b');
		System.out.println('a' + 0.98);
		//System.out.println(10/0);
		System.out.println(-10/0.0);
		//System.out.println(0/0);
		System.out.println(0/-0.0);
		System.out.println(0.0/0);
		
		System.out.println("*****");
		System.out.println(10<Float.NaN);
		System.out.println(10<=Float.NaN);
		System.out.println(10>Float.NaN);
		System.out.println(10>=Float.NaN);
		System.out.println(10==Float.NaN);
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(10 != Float.NaN); //true
		System.out.println(Float.NaN != Float.NaN); //true
		
	}

}
