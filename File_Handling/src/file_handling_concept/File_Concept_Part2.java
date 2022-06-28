package file_handling_concept;

import java.io.File;
import java.io.IOException;

public class File_Concept_Part2 {

	public static void main(String[] args) throws IOException {
		
		
		// Create file -> Current working directory
		File f = new File("demo.txt");
		f.createNewFile();
		System.out.println(f.exists()); //true
		
		//create directory -> current working directory
		File file = new File("durga123");
		file.mkdir();
		//File f1 = new File("durga123","demo1.txt");
		File f1 = new File(file,"demo1.txt");
		f1.createNewFile();
		System.out.println(f1.exists()); //true
		
		// Create File -> E:/xyz folder
		
		File fw = new File("E:\\xyz","demo.txt");
		f.createNewFile();
		System.out.println(f.exists());

	}

}
