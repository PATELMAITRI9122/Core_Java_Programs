package file_handling_concept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge_Data_From2_To_1File {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("file1.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String line = br.readLine();
		
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		
		br = new BufferedReader(new FileReader("demo.txt"));
		line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		
		pw.close();
		br.close();
		pw.flush();
		
		System.out.println("SUCCESSFUL");
		
		

	}

}
