package concurrentCollection;

import java.util.concurrent.CopyOnWriteArraySet;

public class COWS {

	public static void main(String[] args) {
		
		CopyOnWriteArraySet s = new CopyOnWriteArraySet();
		
		s.add("A");
		s.add("B");
		s.add(null);
		s.add("C");
		s.add("A"); //this will return false and ignore by the compiler as it's duplicate
		s.add(10.5);
		
		System.out.println(s);
		

	}

}
