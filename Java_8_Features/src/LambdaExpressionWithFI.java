
public class LambdaExpressionWithFI {

	public static void main(String[] args) {
//		
//		Interfc d = new Demo();
//		d.m1();
		
		Interfc i = () -> System.out.println("Hello From Lambda Expression");
		i.m1();
	}
}

//class Demo implements Interfc{
//	public void m1() {
//		System.out.println("Hello Interface Implemented Method");
//	}
//	
//	//() -> System.out.println("Hello Interface Implemented Method");
//}

interface Interf{
	public void m1();
}

