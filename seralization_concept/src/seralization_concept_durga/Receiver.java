package seralization_concept_durga;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Receiver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("ooo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dogd1 d1 = (Dogd1)ois.readObject();

		System.out.println(d1.i + "...." + d1.j);
	}

}
