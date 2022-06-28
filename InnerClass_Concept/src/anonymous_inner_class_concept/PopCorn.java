package anonymous_inner_class_concept;

public class PopCorn {

	public static void main(String[] args) {
		Test t = new Test() {
			public void test() {
				System.out.println("Spicy-Test");
			}
		};
		t.test();
		Test t2 = new Test();
		t2.test();
		
		System.out.println(t.getClass().getName());
	}
}

class Test {

	public void test() {
		System.out.println("Salty");
	}

	// 100 More Methods

}

/*
 * 
 * Never Recommanded class SubPopCorn extends PopCorn{
 * 
 * //Only - One time Requirement public void test() {
 * System.out.println("Spicy"); } }
 */