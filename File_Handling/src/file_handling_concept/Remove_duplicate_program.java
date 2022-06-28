package file_handling_concept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Remove_duplicate_program {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("output3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		String line = br1.readLine();

		while (line != null) {
			boolean availiable = false;
			BufferedReader br2 = new BufferedReader(new FileReader("output3.txt"));
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
				pw.flush();
			}
			line = br1.readLine();
		}

		System.out.println("SUCCESSFUL");

	}

}
