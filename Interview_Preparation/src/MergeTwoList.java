import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("2");
		
		List<String> mergedList = new ArrayList<String>(list1);
		//System.out.println(mergedList);
		mergedList.addAll(list2);
		System.out.println(mergedList);
		
		LocalDate date = LocalDate.now();
		int mm = date.getMonthValue();
		int dd = date.getDayOfMonth();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d", mm,dd,yyyy);
		
	}

}
