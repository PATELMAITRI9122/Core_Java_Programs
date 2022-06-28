package seralization_concept_durga;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	
	String user_name = "Maitri";
	transient String pwd = "Patel"; //DEFAULT VALUE WILL BE STORED -> NULL
	transient int pin = 9122;
	
	private void writeObject(ObjectOutputStream os) throws Exception {
		
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		int epin = 4444 + pin;
		os.writeObject(epwd);
		os.writeInt(epin);
		
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		
		is.defaultReadObject();
		String epwd = (String)is.readObject();
		pwd = epwd.substring(3);
		int epin = is.readInt();
		pin = epin - 4444;
		
		
		
	}
}

public class Custom_Seralization {

	public static void main(String[] args) throws Exception {
		
		Account a1 = new Account();
		System.out.println(a1.user_name + "....." + a1.pwd + "....." + a1.pin);
		
		//serialize object
		FileOutputStream fos = new FileOutputStream("xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a3 = (Account)ois.readObject();
		
		System.out.println(a3.user_name + "...." +a3.pwd + "....." + a3.pin);

	}

}
