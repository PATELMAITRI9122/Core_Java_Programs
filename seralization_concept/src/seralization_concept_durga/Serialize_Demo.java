package seralization_concept_durga;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize_Demo {

	public static void main(String[] args) throws Exception {
		
		Dog0 d1 = new Dog0();
		
		// Serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		//Deserialization
		FileInputStream fis = new FileInputStream("abc.ser"); //THIS LINE IS RESPONSIBLE TO CREATE FILE
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog0 d2= (Dog0)ois.readObject();
		
		System.out.println(d2.i + "  " + d2.j);

	}

}

class Dog0 implements Serializable{
	 int i = 10;
	 transient int j = 20; //BYDEAULT VALUE WILL BE STORED -> 0
	 //transient int j = 20; // VALUE WILL BE 20
	//transient static int j = 20; // VALUE WILL BE 20
}
