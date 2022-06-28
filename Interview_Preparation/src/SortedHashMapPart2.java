import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortedHashMapPart2 {
	
	public static void main(String[] args) {
		
		// def: Sort The HashMap
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Maitri", 95);
		scores.put("Harsh", 80);
		scores.put("Brijesh", 87);
		scores.put("Anjali", 45);
		
		System.out.println("The original HashMap: " + scores);
		
		scores = sortedByValue(scores);
		
		System.out.println("Sorted HashMap: " + scores);
			
	}
	
	public static Map<String, Integer> sortedByValue(Map<String, Integer> scores){
		
		// Create LinkedListHashMAp
		
		Map<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>();
		
		//get the value from the scores -> entryset
		
		Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
		//System.out.println(entrySet);
		
		// convert set -> list because list is an easy to sort
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		//System.out.println(entryList);
		
		//sort the list
		entryList.sort((x,y) -> x.getValue().compareTo(y.getValue()));
		
		//print the list
		for(Map.Entry<String, Integer> e : entryList) {
			sortedByValue.put(e.getKey(), e.getValue());
		}
		
		return sortedByValue;
		
	
		
		
	}

}
