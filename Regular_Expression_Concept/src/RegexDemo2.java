import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		// Ask user :  Target String 
		// Ask user: pattern to matched with target String
		// Do coding
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Target String: ");
		String targetString = input.nextLine();
		System.out.println("Please Enter the pattern to be matched with Target String: ");
		String pattern = input.nextLine();
		
		int count = 0;
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(targetString);
		
		while(m.find()) {
			count++;
			System.out.println("The indexs: " + m.start()+"...."+m.end()+"..."+m.group());
		}
		System.out.println("The Total Number of occurance of repeated String: " + count);

	}

}
