import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

	//() -> System.out.println("Hello1");
	
//	public void m1(int a, int b) {
//		System.out.println(a+b);
//	}
	
//	  (a, b)->{
//		System.out.println(a+b);
//	}
	
	public int sequareInt(int n) {
		return n*n;
	}
	
	//(int n)->{ return n*n; }
	
	public int name(String s) {
		return s.length();
	} 
	
	//(s)-> s.length();
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
	}
}
