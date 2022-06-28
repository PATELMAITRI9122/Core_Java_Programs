package file_handling_concept;

import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer_Concept_Part_1 {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('C');
		pw.println("durga");
		pw.flush();
		pw.close();
		
		System.out.println("DONE");

	}

}
