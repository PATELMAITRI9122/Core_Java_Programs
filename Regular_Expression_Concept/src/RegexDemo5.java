import java.util.regex.Pattern;

public class RegexDemo5 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[.]");
		String[] s = p.split("www.gmail.com");
		
		for(String s1: s) {
			System.out.println(s1);
		}
	}
}
