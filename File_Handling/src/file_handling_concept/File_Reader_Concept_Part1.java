package file_handling_concept;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader_Concept_Part1 {

	public static void main(String[] args) throws IOException {
	
		// CHARACTER BY CHARACTER READING
		FileReader fr = new FileReader("abc.txt");
		
		int i = fr.read();
		
		while(i != -1) {
			System.out.println((char)i);
			i = fr.read();
		}

		fr.close();
	}

}
