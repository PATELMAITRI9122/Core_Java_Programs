package arrayAsList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"A","L","N","R","C"};
		List l = Arrays.asList(s);
		
		System.out.println(l);
		
		s[1] = "M";
		
		System.out.println(l);
		
		l.set(1, "H");
		
		System.out.println(l);
		
		for(String ss: s) {
			System.out.println(ss);
		}
	}

}
