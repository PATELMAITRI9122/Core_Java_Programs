import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int[] array = { 12, 14, 15, 16, 18, 90, 67 };

		//findSecondLarge(array);
		
		System.out.println(findSecondLarge(array));

	}

	public static int findSecondLarge(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest)
				secondHighest = i;
		}

		return secondHighest;
	}

	
	/*
	 *  12 > negative value -> true 
	 *  sec = -neg value
	 *  highest = 12
	 */
	
}
