
public class Part2 {

	public static void main(String[] args) {
		
		String a = "durga";
		int b = 10, c= 20, d = 30;
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(b+c+a+d);
		System.out.println(b+a+c+d);
		
		System.out.println("***");
		System.out.println('a'>10);
		//System.out.println('a'>false); //CE
		//System.out.println(true>false); //CE
		System.out.println('a'>'A');
		System.out.println('a'>10.5);
		//System.out.println("durga123">"durga321");
		
		System.out.println("*****");
		System.out.println(10<20);
		//System.out.println(10<20<30);
		
		System.out.println("*****");
		System.out.println(10==20);
		System.out.println('a'=='a');
		System.out.println('a'==97.0);
		System.out.println(false==false);
		
		String r1 = "hello";
		String r2 = "hello";
		System.out.println(r1==r2); //true
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1==s2); //false
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;
		System.out.println(t1==t2); //false
		System.out.println(t1==t3); //true
		
		System.out.println("***");
		Thread t = new Thread();
		Object o = new Object();
		String s4 = new String("durga");
		System.out.println(t==o);
		System.out.println(o==s4);
		//System.out.println(s4 == t);
		System.out.println(o == t);
		
		System.out.println("****");
		String w = new String("Durga");
		String w1 = new String("Durga");
		System.out.println(w==w1); //false
		System.out.println(w.equals(w1)); //true
		
		System.out.println(null==null); //true
		System.out.println(w==null); //false
		String w2 = null;
		System.out.println(w2==null); //true
		
		

	}

}
