package String_Concept;

import java.util.Arrays;

public class Remove_Leading_Trailing_Whitespace {
	
	public static void main(String[] args) {
		
		String s = "  abc  def\t";
		s = s.strip();
		System.out.println(s);
		String s1 = s.trim();
		System.out.println(s1);
		
		System.out.println("***");
		
		StringBuffer sb = new StringBuffer();
		char[] charArray = s.toCharArray();
		for(char array: charArray) {
			if(!Character.isWhitespace(array)) {
				sb.append(array);
			}
		}
		System.out.println(sb.toString());
		
		//Sorting an Array
		System.out.println("** Srting an array**");
		int[] array1 = {78,20,58,96,99,415};
		//System.out.println(Arrays.sort(array1));
		Arrays.sort(array1);
		for(int arr: array1) {
			System.out.println(arr);
		}
	}

}
