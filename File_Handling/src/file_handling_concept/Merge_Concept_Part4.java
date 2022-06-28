package file_handling_concept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Merge_Concept_Part4 {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("output2.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		String line = br1.readLine();
		

		while (line != null) {

			boolean availiable = false;
			BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
			String target = br2.readLine();
			

			while (target != null) {
				if (line.equals(target)) {
					availiable = true;
					break;
				}
				target = br2.readLine();
			}

			if (availiable == false) {
				pw.println(line);
			}
			line = br1.readLine();
		}
		
		pw.flush();
		pw.close();
		System.out.println("SUCCESSFUL");
	}

}
