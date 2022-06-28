
public interface InterfaceWithStaticAndDeafultMethod {
	
	//regular abstract method
	public void hello();
	
	//default method
	default void helloMaitri() {
		System.out.println("Hello Maitri Default Method");
	}
	
	//static method
	public static void HelloMaitri() {
		System.out.println("HelloMaitri Static Method");
	}

}
