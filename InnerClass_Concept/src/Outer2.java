
public class Outer2 {
	
	int x = 10;
	
	class Inner{
		int x = 100;
		
		public void m1() {
			int x = 1000;
			System.out.println(x); //1000
			System.out.println(this.x); //100
			System.out.println(Inner.this.x); //100
			//inner class -> x -> 100
			System.out.println(Outer2.this.x); // Outer class -> x -> 10
		}
	}
	
	public static void main(String[] args) {
		
		new Outer2().new Inner().m1(); 
		
	}

}
