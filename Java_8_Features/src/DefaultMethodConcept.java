
public class DefaultMethodConcept {

	public static void main(String[] args) {

		B1 object = new B1();
		object.m1();
	}

}

interface A {
	default void m1() {
		System.out.println("hello ");
	};

	public void m2();

	default void m3() {
		System.out.println("Hello");
	};

}

class B1 implements A {
	public void m1() {
		System.out.println(" Overriding deafault Method m1");
	}

	public void m2() {
		System.out.println("Hello");
	}
}
