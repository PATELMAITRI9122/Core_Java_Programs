import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortHashMap {

	public static void main(String[] args) {

		Map<String, Integer> scores = new LinkedHashMap<String, Integer>();
		
		scores.put("Maitri", 95);
		scores.put("Harsh", 80);
		scores.put("Brijesh", 87);
		scores.put("Anjali", 45);
		
		System.out.println(scores);
		
		scores = sortByValue(scores);
		
		System.out.println(scores);
	}
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> scores){
		
		Map<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>();
		
		//get entryset
		
		Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
		//System.out.println(entrySet);
		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		//System.out.println(entryList);
		
		//sort the list
		entryList.sort((x,y) -> x.getValue().compareTo(y.getValue()));
		//System.out.println(entryList);
		
		for(Map.Entry<String, Integer> e : entryList) {
			sortedByValue.put(e.getKey(), e.getValue());
		}
		
		return sortedByValue;
	}

}
