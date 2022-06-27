package part_2_String;

import java.util.Stack;

public class STACK_PUSH_POP {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();

		st.push("HELLO");
		st.push("GOOD");
		st.push("MORNING");

		// System.out.println(st);

		printStack(st);
		st.push("FIRST");
		printStack(st);
		st.push("SECOND");
		printStack(st);

		st.pop();
		printStack(st);

		st.pop();
		printStack(st);
		
		System.out.println();
		System.out.println(st.peek());
		//st.peek();
		
		

	}

	private static void printStack(Stack<String> st) {
		if(st.isEmpty())
			System.out.println("YOU HAVE NOTHING INSIDE STACK");
		else
			System.out.printf("BOTTOM %s TOP \t",st);

	}

}
