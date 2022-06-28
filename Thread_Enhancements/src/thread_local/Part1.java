package thread_local;

public class Part1 {

	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal();
		
//		ThreadLocal tl = new ThreadLocal() {
//			protected Object initialValue() {
//				return "abc";
//			};
//		};
		
		System.out.println(tl.get()); //abc ; null -> not override
		tl.set("VVV");
		System.out.println(tl.get()); //VVV
		tl.remove();
	
		System.out.println(tl.get()); //abc ; null -> not override
		

	}

}
