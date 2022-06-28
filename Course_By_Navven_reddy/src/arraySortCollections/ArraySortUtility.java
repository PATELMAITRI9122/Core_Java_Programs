package arraySortCollections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 5, 11, 20, 6 };

//		for (int a1 : a) {
//			System.out.println(a1);
//		}
		
		
//		Arrays.sort(a);
//		for (int a1 : a) {
//			System.out.println(a1);
//		}
		
		String[] s = {"A","C","K","D"};
		//System.out.println(s);
		
//		for (String s1 : s) {
//			System.out.println(s1);
//		}
		
//		Arrays.sort(s);
//		
//		for (String s1 : s) {
//			System.out.println(s1);
//		}
		
		Arrays.sort(s, new myccc());
		for (String s1 : s) {
			System.out.println(s1);
		}


	}

}

class myccc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
	
}
