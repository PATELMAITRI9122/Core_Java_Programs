package file_handling_concept;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader_Concept_Part_3 {

	public static void main(String[] args) throws IOException{
		
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		char read[] = new char[(int)f.length()];
		
		fr.read(read);
		
		for(char ch1: read) {
			System.out.print(ch1);
		}
		
		System.out.println("*****");
		
		FileReader fr1 = new FileReader("abc.txt");
		int i = fr1.read();
		
		while(i != -1) {
			System.out.println((char)i);
			i = fr1.read();
		}
		
		fr.close();
	}

}
