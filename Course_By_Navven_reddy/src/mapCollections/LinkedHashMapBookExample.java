package mapCollections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book(1, "Maitri", "Maitri", "Maitri", 1);
		Book b2 = new Book(2, "Harsh", "Harsh", "Harsh", 2);
		Book b3 = new Book(3, "Brijesh", "Brijesh", "Brijesh", 3);

		Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<Integer, Book> m1 = (Map.Entry<Integer, Book>) itr.next();

			int key = m1.getKey();
			Book b = m1.getValue();

			System.out.println(key + "Details ");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);

			// System.out.println(m1.getKey() + " " + m1.getValue());
		}

	}

}

class Book {

	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
