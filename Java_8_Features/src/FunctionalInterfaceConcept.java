
public class FunctionalInterfaceConcept {

}

@FunctionalInterface

//annotation is an optional -> explicitly we are declaring so if some error come compiler will notify us

interface Interfc{
	
	public void m1();
	//public void m11();
	public static void m2() {
		System.out.println("hello");
	}
	 default void m3() {
		System.out.println("Hello From default");
	}
	
}

@FunctionalInterface
interface B extends Interfc{
	public void m1();
}

interface C extends Interfc{
	public void m5();
}