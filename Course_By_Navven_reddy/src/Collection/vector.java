package Collection;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector(10,5);
		System.out.println(v.capacity()); //10
		
		for(int i = 1; i<=10; i++) {
			v.addElement(i);
		}
		
		System.out.println(v); // toString method is being called here
		System.out.println(v.get(1));
		
		System.out.println(v.capacity()); //10
		v.addElement("M");
		System.out.println(v.capacity());
		
	}

}
