package file_handling_concept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Merge_Concept_Part3 {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("output.txt");
		
		File f = new File("E:\\xyz");
		String[] s = f.list();
		
		for(String s1: s) {
			
			File f1 = new File(f,s1);
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line = br.readLine();
			
			while(line!=null) {
				pw.println(line);
				line = br.readLine();
			}
		}
		
		pw.close();
		pw.flush();
		
		System.out.println("SUCCESSFUL");

	}

}
