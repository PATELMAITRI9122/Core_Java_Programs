import java.util.HashMap;
import java.util.Map;

public class StringCount {
	
	public static void main(String[] args) {
		
		String str1 = "abcdABCDabcd";
		
		char[] array = str1.toCharArray();
		
		Map<Character, Integer> charsCount = new HashMap<Character, Integer>();
		
		for(char cf:array) {
			if(charsCount.containsKey(cf)) {
				charsCount.put(cf, charsCount.get(cf)+1);
			}else
				charsCount.put(cf, 1);
		}
		System.out.println(charsCount);
		
		String str2 = "abcdABCDabcdABCD";
		
		str2 = str2.replace("a", "");
		System.out.println(str2);
	}

}
