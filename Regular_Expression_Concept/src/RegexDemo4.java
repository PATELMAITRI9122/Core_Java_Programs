import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	
	public static void main(String[] args) {
		
		String x = "a?";
		
		Pattern p = Pattern.compile(x);
		Matcher m = p.matcher("fff");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
	}

}
