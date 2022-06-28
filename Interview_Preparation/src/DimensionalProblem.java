
public class DimensionalProblem {
	
	public static void main(String[] args) {
		
	}

}

interface AA{
	public void print();
}

class A {
	public void print() {
		System.out.println("Class A");
	}
}

class B extends A implements AA{
	public void print() {
		System.out.println("Class B");
	}
}

class C extends A,B{
	public void print() {
		System.out.println("Class C");
	}
}

