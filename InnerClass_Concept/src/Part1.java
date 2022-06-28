
public class Part1 {
	
	static class inner{
		
		public static void m1() {
			System.out.println("Inner-Class Method");
		}
		
	}
	
	public void m2() {
		
		inner iobject = new inner();
		iobject.m1();
		
	}
	
	public static void main(String[] args) {
		
		/*Part1 object = new Part1();
		//Part1.inner i = object.new inner();
	//	Part1.inner i = new Part1().new inner();
		Part1.inner i = new inner();
		i.m1();
		
		System.out.println("Outer-Class Main Method");*/
		
		//main -> m2()
		
		Part1 object = new Part1();
		object.m2();
		
	}
	
	

}
