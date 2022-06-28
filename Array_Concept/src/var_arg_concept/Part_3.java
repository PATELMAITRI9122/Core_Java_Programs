package var_arg_concept;

public class Part_3 {

	public static void main(String[] args) {
		int[] a = {10,20};
		int[] b = {10,20,30};
		m1(a,b);
	}
	
	public static void m1(int[]...a) {
		
		for(int[] x1: a) {
			System.out.println(x1[0]);
		}
	}

}
