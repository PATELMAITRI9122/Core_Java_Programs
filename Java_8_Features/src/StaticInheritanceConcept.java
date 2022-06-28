
public class StaticInheritanceConcept implements Intt {

	public static void main(String[] args) {
		Intt.m1();
//		
	}

}

interface Intt {
	public static void m1() {
		System.out.println("interface Static method");
	}

	public static void main(String[] args) {
		System.out.println("Inteface Main Method");
	}
}
