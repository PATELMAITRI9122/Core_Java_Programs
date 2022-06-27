package part_2_String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCollections {

	public static void main(String[] args) {
		
		String s[] = {"KK","LL","KK","MM","KK"};
		List<String> list = Arrays.asList(s);
		
		System.out.printf("%s",list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s",set);
		
		

	}

}
