package file_handling_concept;

import java.io.File;
import java.io.IOException;

public class File_Concept_Part1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists()); //false
		
		f.createNewFile();
		
		System.out.println(f.exists()); //true
		
		
		File f1 = new File("Maitri123");
		System.out.println(f1.exists()); //false
		f1.mkdir();
		System.out.println(f1.exists()); //true

	}

}
