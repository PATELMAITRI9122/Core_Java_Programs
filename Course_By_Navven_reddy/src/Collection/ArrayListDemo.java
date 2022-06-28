package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		al.add(2, "Maitri");
		System.out.println(al);

	}

}
