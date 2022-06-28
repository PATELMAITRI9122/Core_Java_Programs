package Collection;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack(); // LAST IN FIRST OUT 
		
		s.push("M"); // PUSH -> ADD ELEMENT
		s.push("A"); 
		s.push("I");
		System.out.println(s);
		System.out.println(s.search("I"));
		s.pop(); // REMOVE TOP OF THE ELEMENT
		//System.out.println(s);
		s.peek(); // FETCH ELEMENT FROM TOP OF THE STACK
		System.out.println(s);
		System.out.println(s.search("I"));
	}

}
