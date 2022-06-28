package seralization_concept_durga;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Externalizable_Demo {

	public static void main(String[] args) throws Exception {
		
		Exter ex = new Exter("MAITRI",10,20);
		
		FileOutputStream fos = new FileOutputStream("mmm.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ex);
		
		FileInputStream fis = new FileInputStream("mmm.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Exter ex2 = (Exter)ois.readObject();
		
		System.out.println(ex2.s + "....." + ex2.i + "...." + ex2.j);

	}

}

class Exter implements Externalizable{
	
	String s;
	int i;
	int j;
	
	public Exter() {
		System.out.println("No-Arg constructor");
	}
	
	public Exter(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(s);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		s = (String)in.readObject();
		i = in.readInt();
		
	}
	
}
