
public class Finalize_concept {
	
	public static void main(String[] args) {
		
		
		//String s = "AAA";
		Finalize_concept s = new Finalize_concept();
		s = null;
		System.gc();
		System.out.println("End of main");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("overriden finalize method");
	}

}
