package file_handling_concept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer_Concept_Part1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		
		char[] ch = {'M','A','I','T','R','I'};
		
		bw.write(ch);
		bw.newLine();
		
		bw.write("Maitri");
		bw.newLine();
		bw.write("Programming");
		
		bw.flush();
		bw.close();
		
		System.out.println("COMPLETED");

	}

}
