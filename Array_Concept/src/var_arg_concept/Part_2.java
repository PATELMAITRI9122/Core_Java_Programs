package var_arg_concept;

public class Part_2 {

	public static void main(String[] args) {
		
		sum();
		sum(10,20);
		sum(10,20,30);

	}
	
	public static void sum(int...a) {
		int total = 0;
		for(int x1 : a) {
			total = total + x1;
		}
		System.out.println("Total: " + total);
		System.out.println(a.length);
	}

}
