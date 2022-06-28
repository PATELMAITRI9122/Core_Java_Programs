import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("[abc]");
		//Pattern p = Pattern.compile("[^abc]");
		//Pattern p = Pattern.compile("[a-zA-Z]");
		//Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Pattern p = Pattern.compile("[0-9]");
		
		Matcher m = p.matcher("a7b@z#9A");
		
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
	}

}
