package Collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		LinkedList l = new LinkedList();
		
		System.out.println(al instanceof Serializable); //true
		System.out.println(al instanceof Cloneable); //true
		System.out.println(al instanceof RandomAccess); //true
		System.out.println(l instanceof RandomAccess); //false
		System.out.println(l instanceof Cloneable); // true
		System.out.println(l instanceof Serializable); //true
//		System.out.println(al instanceof );
		

	}

}
