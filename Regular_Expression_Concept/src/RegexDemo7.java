import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//Define Regex Pattern 
		//String pattern = "(0|91)?[7-9][0-9]{9}";
		String pattern =  "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		
		//Ask user for mobile Number
		//System.out.println("Please Enter Mobile Number: ");
		System.out.println("Please Enter email Id: ");
		//String mobile_Number = input.nextLine();
		String emailId = input.nextLine();
		
		//System.out.println(mobile_Number);
	//	String temp = "917909122522";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(emailId);
		
		if(m.find() && m.group().equals(emailId)) {
			System.out.println("Valid EmailId");
		}else {
			System.out.println("Invalid EmailId");
		}

	}

}
