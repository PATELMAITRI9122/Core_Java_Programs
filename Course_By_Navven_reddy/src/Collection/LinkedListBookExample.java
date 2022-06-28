package Collection;

import java.util.LinkedList;

public class LinkedListBookExample {
	
	public static void main(String[] args) {
		
		LinkedList<Book> l = new LinkedList<Book>();
		
		Book b1 = new Book(101, "Maitri", "ABC", "ABC", 2);
		Book b2 = new Book(102, "Harsh", "DEW", "DEW", 3);
		Book b3 = new Book(103, "Brijesh", "PQR", "PQR", 5);
		
		l.add(b1);
		l.add(b2);
		l.add(b3);
		
		for(Book b : l) {
			System.out.println(b.id + " " + b.name + " "+ b.author + " "+ b.publiser+" " + b.quantity);
		}
		
	}

}

class Book {
	
	int id;
	String name, author, publiser;
	int quantity;

	public Book(int id, String name, String author, String publiser, int quantity) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publiser = publiser;
		this.quantity = quantity;
	}
	
}
