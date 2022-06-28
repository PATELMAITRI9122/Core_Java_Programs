package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class compartorCollectionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t  = new TreeSet(new myCompartor());
		t.add("MAITRI");
		t.add("Harsh");
		t.add("Brijesh");
		t.add("pinky");
		
		System.out.println(t);

	}

}

class myCompartor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = (String)o1; //o1.toString(); 
		String s2 = o2.toString();
		
		
		//return s2.compareTo(s1); - descending order
		//return s1.compareTo(s1); // simillar to return 0 duplicate element
		return -s1.compareTo(s2); //DESCENDING ORDER
	}
	
}
