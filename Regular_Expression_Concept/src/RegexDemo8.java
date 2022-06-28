import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
	
	public static void main(String[] args) throws IOException {
		
		//Program to extract mobile number and Email Id from input.txt
		// mobile number mixed with normal text data
		
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}|[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		
		PrintWriter pw = new PrintWriter("output_Regex.txt");
		BufferedReader br = new BufferedReader(new FileReader("input_Regex.txt"));
		
		String line = br.readLine();
		while(line != null) {
			
			Matcher m = p.matcher(line);
			while(m.find()) {
				pw.println(m.group());
			}
			line = br.readLine();
		}
		
		pw.flush();
		pw.close();
		
	}

}