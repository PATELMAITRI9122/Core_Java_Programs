package seralization_concept_durga;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_with_inheritance {

	public static void main(String[] args) throws Exception {
		
		Dog d1 = new Dog();
		System.out.println(d1.i + "....." + d1.j);
		
		//Serialization
		
		FileOutputStream fos = new FileOutputStream("zzz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		//deserialization 
		
		FileInputStream fis = new FileInputStream("zzz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d2.i);
		System.out.println(d2.j);

	}

}

class Animal implements Serializable{
	int i = 10;
}

class Dog extends Animal{
	 int j = 20;
}
