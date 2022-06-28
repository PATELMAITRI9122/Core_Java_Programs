package generic_Collections;

import java.util.ArrayList;

public class GenericsWildCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<?> l = new ArrayList<String>();
		
		ArrayList<? extends Number> l1 = new ArrayList<Number>();
		
		//ArrayList<? extends Number> l2 = new ArrayList<String>(); 
		
		ArrayList<? extends Number> l2 = new ArrayList<Integer>();
		
		//ArrayList<?> l3 = new ArrayList<? extends Number>(); //invalid

	}

}


