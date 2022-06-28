package arrays_concept;

public class Part_2 {

	public int x = 10;
	public static void main(String[] args) {
		
		String[] argh = {"X","Y","Z"};
		args = argh;
		
		for(String s: args) {
			System.out.println(s);
		}
		
		//System.out.println(x);
		
		Part_2 p = new Part_2();
		System.out.println(p.x);
		
	}
	
	public void m1() {
		final int x = 10;
	}

}
