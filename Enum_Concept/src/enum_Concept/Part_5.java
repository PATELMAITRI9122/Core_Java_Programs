package enum_Concept;


// Anonymous inner Class approach
enum color{
	
	BLUE, RED{
		public void info() {
			System.out.println("Danger Color");
		}
	}, GREEN;
	
	public void info() {
		System.out.println("BLUE-GREEN COLOR");
	}
	
}



public class Part_5 {

	public static void main(String[] args) {
		
		color[] c = color.values();
		
		for(color c1 : c) {
			c1.info();
		}

	}

}
