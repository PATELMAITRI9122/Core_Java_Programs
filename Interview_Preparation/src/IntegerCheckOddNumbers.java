import java.util.ArrayList;
import java.util.List;

public class IntegerCheckOddNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(17);
		list.add(20);
		
		System.out.println(checkOddNumber(list));

	}
	
	public static boolean checkOddNumber(List<Integer> list) {
		
//		for(int i : list) {
//			System.out.println(i);
//		}
		
		for(int l : list) {
			if(l % 2 == 0) {
				return false;
			}
		}
		return true;
	}

}
