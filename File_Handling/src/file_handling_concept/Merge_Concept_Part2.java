package file_handling_concept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Merge_Concept_Part2 {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("file2.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("demo.txt"));
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while(line1 != null || line2 != null) {
			
			if(line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}
			
			if(line2 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
			
		}
		
		pw.close();
		br1.close();
		br2.close();
		pw.flush();
		
		System.out.println("SUCCESSFUL");
		

	}

}
