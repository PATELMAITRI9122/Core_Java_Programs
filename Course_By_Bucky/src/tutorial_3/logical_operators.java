package tutorial_3;

public class logical_operators {
	
	public static void main(String args[]) {
		int boy, girl;
		boy = 8;
		girl = 14;
		
		
		if (boy > 10 && girl < 16) {
			System.out.println("You can enter");
		}else {
			System.out.println("You can not enter");
		}
		
		if (boy > 10 || girl < 14) {
			System.out.println("You can enter");
		}else {
			System.out.println("You can not enter");
		}
	}

}
