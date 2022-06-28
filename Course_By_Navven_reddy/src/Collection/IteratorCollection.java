package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		for(int i = 0; i<=10; i++) {
			
			al.add(i);
			
		}
		
		System.out.println(al); //[0,1,2,...10]
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) { //true
			
			Integer i = (Integer)itr.next();
			if (i%2 == 0) {
				
				System.out.println(i);
			}else {
				//System.out.println(i);
				itr.remove();
				//System.out.println(i);
			}
			
		}
		System.out.println(al);
		
		

	}

}
