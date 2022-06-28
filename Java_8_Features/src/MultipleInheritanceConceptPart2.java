
public class MultipleInheritanceConceptPart2 implements Left, Right {

	public static void main(String[] args) {
		 MultipleInheritanceConceptPart2 obj = new MultipleInheritanceConceptPart2();
		 obj.m1();
	}

	public void m1() {
		// System.out.println("Our own Method");
		Left.super.m1();
		Right.super.m1();
	}
}

interface Left {
	default void m1() {
		System.out.println("Default Left Method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Default Right Method");
	}
}
