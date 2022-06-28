package arrays_concept;

public class Part_1 {

	public static void main(String[] args) {
		
	//	int x[] = new int[4];
	//	int[] x1 = new int[2.5];
		
		sum(new int[] {10,20,30,40});
		
		int[] x = new int[] {10,20,30,40};
		

	}
	
	public static void sum(int[] x) {
		int total = 0;
		for(int x1: x) {
			total = total + x1;
		}
		System.out.println("Total: " + total);
	}

}
