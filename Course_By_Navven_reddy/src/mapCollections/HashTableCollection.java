package mapCollections;

import java.util.Hashtable;

public class HashTableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable(25); // initial capacity here; 25
		
		h.put(new Tempp(5), "A");
		h.put(new Tempp(2), "B");
		h.put(new Tempp(6), "C");
		h.put(new Tempp(15), "D");
		h.put(new Tempp(23), "E");
		h.put(new Tempp(16), "F");
		//h.put(null, "kkk");
		
		System.out.println(h);

	}

}

class Tempp{
	
	int i;
	
	public Tempp(int i) {
		
		this.i = i;
	}
	
	public int hashCode() {
		
		return i ;
		
		//{16=F, 15=D, 6=C, 23=E, 5=A, 2=B} i % 9
		//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
		
	}
	
	@Override
	public String toString() {
		
		return i + "";
	}
	
}
