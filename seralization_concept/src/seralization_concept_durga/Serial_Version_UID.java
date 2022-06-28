package seralization_concept_durga;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial_Version_UID {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dogd1 d1 = new Dogd1();
		FileOutputStream fos = new FileOutputStream("ooo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		

	}

}



