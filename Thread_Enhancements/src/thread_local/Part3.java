package thread_local;

public class Part3 {

	public static void main(String[] args) {
		
		ParentThread pt = new ParentThread();
		pt.start(); // main thread

	}

}

class ParentThread extends Thread{
	
	static InheritableThreadLocal tl = new InheritableThreadLocal();
	//{
//		protected Object childValue(Object p) {
//			return "cc";
//		};
	//};
	
	@Override
	public void run() {
		tl.set("AA");
		System.out.println("Parent Thread..." + tl.get());
		
		ChildThread ct = new ChildThread(); // run by Parent Thread
		ct.start();
	}
	
}

class ChildThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Child Thread..." + ParentThread.tl.get()); //Parent Thread -> Local Variable -> won't be availiable to -> Child Thread -> ThreadLocal variable declared
		//return null
	}
	
	
}
