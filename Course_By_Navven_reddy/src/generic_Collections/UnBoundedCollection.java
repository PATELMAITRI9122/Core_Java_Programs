package generic_Collections;

public class UnBoundedCollection<T extends Number & Runnable> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	UnBoundedCollection<Integer, > ui = new UnBoundedCollection<Integer>();
		//UnBoundedCollection<String> ui2 = new UnBoundedCollection<String>(); // This will give me compile time error because it extends Number
		
		//UnBoundedCollection<Runnable> ui2 = new UnBoundedCollection<Runnable>();
		//UnBoundedCollection<Integer> ui3 = new UnBoundedCollection<Integer>(); //THis will give me compile time error because this class is not an implementation of Runnable
		
		//UnBoundedCollection<Thread> ui3 = new UnBoundedCollection<Thread>();
	
	}

}

class Test<T extends Number & Runnable & Comparable>{
	
}

//class Test1<T extends Runnable & Runnable>// Invalid
