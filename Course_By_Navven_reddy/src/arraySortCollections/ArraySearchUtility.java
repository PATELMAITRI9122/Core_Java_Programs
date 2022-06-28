package arraySortCollections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySearchUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a = {10,2,14,15,0,3};
//		Arrays.sort(a);
//		System.out.println("Sorted Array");
//		for (int a1 : a) {
//			System.out.println(a1);
//		}
//		
//		System.out.println("Searching");
//		System.out.println(Arrays.binarySearch(a, 10));
//		System.out.println(Arrays.binarySearch(a, 20));
//		System.out.println(Arrays.binarySearch(a, -1));

		String[] s = { "A", "V", "C", "B" };
		// Arrays.sort(s);
//		System.out.println("Sorted Array");
//		for (String s1 : s) {
//			System.out.println(s1);
//		}
//		
//		System.out.println("Searching");
//		System.out.println(Arrays.binarySearch(s, "V"));
//		System.out.println(Arrays.binarySearch(s, "a"));
//		System.out.println(Arrays.binarySearch(s, "0"));
		
		Arrays.sort(s, new mcc());
		System.out.println(s);
		
		System.out.println(Arrays.binarySearch(s, "C", new mcc()));

	}

}

class mcc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
	
}
