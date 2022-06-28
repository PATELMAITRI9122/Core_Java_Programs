package var_arg_concept;

public class Part_1 {

	public static void main(String[] args) {
		m1(10);
		m1();
		
		

	}
	
	public static void m1(int...a) {
		System.out.println("Var-arg method" + a.length);
	}

}
