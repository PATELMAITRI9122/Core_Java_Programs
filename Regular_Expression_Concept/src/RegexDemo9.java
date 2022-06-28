import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Maitri
 * Program to display .txt -> C:\Users\Maitri\eclipse-workspace\Regular_Expression_Concept
 *
 */

public class RegexDemo9 {
	
	public static void main(String[] args) {
		
		//regular expression for file 
		//[a-zA-Z0-9][a-zA-Z0-9$_]*[.]txt
		
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$_]*[.]txt");
		File f = new File("C:\\Users\\Maitri\\eclipse-workspace\\File_Handling");
		
		String[] list = f.list();
		int count = 0;
		
		for(String s1 : list) {
			Matcher m = p.matcher(s1);
			if(m.find() && m.group().equals(s1)) {
				count++;
				System.out.println(s1);
			}	
		}
		System.out.println("Total Count: " +count);
		
	}

}
