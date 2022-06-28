import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachConcept {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		//use of ForEach Loop
		
//		for(Integer l1 : list) {
//			System.out.println(l1);
//		}
		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		list.stream().forEach(System.out::println);
	}

}
