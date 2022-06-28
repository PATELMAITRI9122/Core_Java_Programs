package file_handling_concept;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_Concept_Part_1 {

	public static void main(String[] args) throws IOException{
		
		//FileWriter fw = new FileWriter("abc.txt");
		
		FileWriter fw = new FileWriter("abc.txt",true);
		
		
		fw.write(100);
		fw.write("durga\nSoftware\tSolutions");
		fw.write('\n');
		
		char[] ch = {'a','b','c'};
		
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
		System.out.println("SUCESSFULLY");

	}

}
