package tutorial_3;

public class enhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {22,32,11,20};
		
		int total = 0;
		
		for(int x : number) {
			total += x;
		}

		System.out.println(total);
	}

}
