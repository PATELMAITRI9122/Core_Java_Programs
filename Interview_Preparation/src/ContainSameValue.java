import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainSameValue {
	
	public static void main(String[] args) {
		
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {4,5,6};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElement(a1,a2));
		System.out.println(sameElement(a2,a3));
		
	}
	
	public static boolean sameElement(Object[] a1, Object[] b) {
		
		Set<Object> uElement1 = new HashSet<Object>(Arrays.asList(a1)); //5
		Set<Object> uElement2 = new HashSet<Object>(Arrays.asList(b)); //3
		
		if (uElement1.size() != uElement2.size()) {
			return false;
		}
		
		for(Object obj : uElement1) {  //obj1 -> 12321
			if(uElement2.contains(obj)) //u2 -> 456
				return false;
			//System.out.println(uElement2);
		}
		
		
		return true;
	}

}
