package file_handling_concept;

import java.io.File;

public class File_Concept_Part4 {

	public static void main(String[] args) throws Exception {
		
		int count = 0;
		
		File file = new File("C:\\Users\\Maitri\\eclipse-workspace\\File_Handling");
		
		String s[] = file.list();
		
		for(String s1: s) {
			
			File f1 = new File(file,s1);
			
			if(f1.isDirectory()) { //if(f1.isFile())
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("The total Number: " + count);
		

	}

}
