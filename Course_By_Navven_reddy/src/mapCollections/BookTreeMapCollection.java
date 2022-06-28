package mapCollections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class BookTreeMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, TreeBook> map = new TreeMap<Integer, TreeBook>();
		
		TreeBook b1 = new TreeBook(1, "Maitri", "ABC", "ABC", 1);
		TreeBook b2 = new TreeBook(2, "Harsh", "CDQ", "CDQ", 2);
		TreeBook b3 = new TreeBook(3, "Brijesh", "PQR", "PQR", 3);
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for(Map.Entry<Integer, TreeBook> entry: map.entrySet()) {
			int key = entry.getKey();
			TreeBook b = entry.getValue();
			
			System.out.println("ELEMENTS");
			
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity + " " );
		}
		
	}

}

class TreeBook implements Comparator{
	int id, quantity;
	String name, author, publisher;
	
	public TreeBook(int id, String name, String author, String publisher, int quantity) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
