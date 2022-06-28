package String_Concept;

import java.util.Arrays;

public class Recursion {
	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
		
//		int[] a = {5,6,41,45,25};
//		findSecondLargest(a);
	}
	
	private static int sum(int k) {
		if(k>0) {
			return k + sum(k-1);
		}else
			return 0;
	}
	

		
	}
}
