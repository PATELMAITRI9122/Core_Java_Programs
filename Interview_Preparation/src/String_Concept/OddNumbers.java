/**
 * List contain only odd number
 */

package String_Concept;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(17);
		list.add(15);
		list.add(23);
		
		System.out.println(checkOddNumber(list));
		
	}
	
	public static boolean checkOddNumber(List<Integer> list) {
		
			for(int i : list) {
				if(i%2 == 0)
					return false;
			}
			return true;
	}

}
