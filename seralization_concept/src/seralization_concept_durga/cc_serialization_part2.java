package seralization_concept_durga;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class cc_serialization_part2 {

	public static void main(String[] args) throws Exception {
		
		dog11 d1 = new dog11();
		d1.i = 888;
		d1.j = 999;
		
		FileOutputStream fos = new FileOutputStream("kkk.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println("DESRIALIZATION STARTED");
		
		FileInputStream fis = new FileInputStream("kkk.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		dog11 d2 = (dog11)ois.readObject();
		
		System.out.println(d2.i + "....." + d2.j);
		
	}

}

class Animal11{
	
	int i = 10; //at seralization time -> JVM -> put default value
	
	public Animal11() {
		// TODO Auto-generated constructor stub
		System.out.println("ANIMAL CONSTRUCTION");
	}
}

class dog11 extends Animal11 implements Serializable{
	
	int j = 20;
	
	dog11(){
		// RULE NO3: -> at DESERIALIZATION TIME -> JVM -> CHECK -> NO-ARG CONSTRUCTOR -> PROGRAMMER CONSTRUCTOR
		System.out.println("DOG CONSTRUCTOR CALLED");
	}
	
}
