package tutorial_3;

public class arrayInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {10,20,30};
		change(number);
		
		for(int y: number) {
			System.out.println(y);
		}

	}
	
	public static void change(int x[]) {
		for(int counter = 0; counter<x.length;counter++) {
			x[counter]+=5;
		}
		
	}

}
