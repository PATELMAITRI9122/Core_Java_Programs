package queueCollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityBookCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Book> b = new PriorityQueue<Book>();
		
		Book b1 = new Book(1, "ABC", "ABC", "ABC", 1);
		Book b2 = new Book(2, "PQR", "PQR", "PQR", 2);
		Book b3 = new Book(3, "XYZ", "XYZ", "XYZ", 3);
		
		b.offer(b1);
		b.offer(b2);
		b.offer(b3);
		
		System.out.println("*****");
		
		for(Book bw : b) {
			System.out.println(bw.id + " " + bw.name + " " + bw.author + " " + bw.publisher + " " + bw.quantity);
		}

	}

}

class Book implements Comparable<Book>{
	
	int id;
	String name, author, publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		
		if(this.id > o.id) {
			return 1;
		}else if(this.id < o.id) {
			return -1;
		}else
			return 0;
		
	
	}
	
}
