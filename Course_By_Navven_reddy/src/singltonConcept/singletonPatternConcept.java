package singltonConcept;

public class singletonPatternConcept {
	
	private static singletonPatternConcept single_instace = null;
	
	public String s;
	
	private singletonPatternConcept() {
		s = "Hello I am a String part of singlton class";
	}
	
	public static singletonPatternConcept getInstance() {
		if(single_instace == null)
			single_instace = new singletonPatternConcept();
		return single_instace;
	}

	public static void main(String[] args) {
		
		singletonPatternConcept x = singletonPatternConcept.getInstance();
		
		System.out.println("HashCode of X is: " + x.hashCode());
		
		singletonPatternConcept y = singletonPatternConcept.getInstance();
		System.out.println("HashCode of Y is: " + y.hashCode());
		singletonPatternConcept z = singletonPatternConcept.getInstance();
		System.out.println("HashCode of Z is: " + z.hashCode());
		
		if(x == y && y == z) {
			System.out.println("These Objects point to the same memory lecation on the Heap");
		}else
			System.out.println("Different location of Heap Memory");
		

	}

}
