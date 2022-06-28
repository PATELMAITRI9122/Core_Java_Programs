package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		l.add("Maitri");
		l.add("Brijesh");
		l.add("Pinky");
		l.add("Harsh");
		
		System.out.println(l);
		
		ListIterator ltr = l.listIterator();
		
		while(ltr.hasNext()) {
			String s = (String)ltr.next();
			
			if (s.equals("Maitri")) {
				ltr.remove();
			}else if(s.equals("Harsh")) {
				ltr.add("Patel");
			}else if (s.equals("Brijesh")){
				ltr.set("Bye");
			}
		}
			
		System.out.println(l);	
	}

}
