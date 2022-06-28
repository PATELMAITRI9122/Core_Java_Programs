package file_handling_concept;

import java.io.File;
import java.io.IOException;

public class File_Concept_Part3 {

	public static void main(String[] args) throws Exception {
	
		int count = 0;
		File file = new File("c:\\Users\\Maitri\\eclipse-workspace\\File_Handling\\src\\file_handling_concept");
		
		String s[] = file.list();
		
		for(String s1: s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total Number: " +count);
	}
		

}
