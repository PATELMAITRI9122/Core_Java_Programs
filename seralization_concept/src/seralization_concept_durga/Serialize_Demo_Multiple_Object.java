package seralization_concept_durga;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize_Demo_Multiple_Object {

	public static void main(String[] args) throws Exception {
	
		Dog1 d1 = new Dog1();
		
		FileOutputStream fos = new FileOutputStream("vcd.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		
		FileInputStream fis = new FileInputStream("vcd.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1)ois.readObject();
		
		System.out.println(d2.c.r.j);
		
	//	System.out.println(d2.);
		

	}

}

class Dog1 implements Serializable{

	Cat1 c = new Cat1();
}

class Cat1 implements Serializable {
	
	Rat1 r = new Rat1();
}

class Rat1 implements Serializable{
	int j = 20;
}
