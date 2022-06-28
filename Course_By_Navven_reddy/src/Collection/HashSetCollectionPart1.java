package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollectionPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashSet<Integer> h = new HashSet<Integer>();
//		
//		h.add(15);
//		h.add(20);
//		h.add(25);
//		h.add(30);
//		
//		for(Integer i : h) {
//			System.out.println(i);
//		}
		
		HashSet<ArrayList> h = new HashSet<ArrayList>();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		h.add(al);
		
		System.out.println(h);

	}

}
