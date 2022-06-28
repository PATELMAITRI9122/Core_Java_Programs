import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {

		// Pattern String : ab
		// Matcher - Target String : ababafdgab

		int count = 0;

		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababafdgab");

		while (m.find()) {
			count++;
			System.out.println(m.start()); //return index of previous match
		}
		
		System.out.println("Ocuurance of ab in Target String: " + count);

	}

}
