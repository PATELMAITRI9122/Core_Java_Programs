package functional_inteface_concept;

import java.util.function.Consumer;

public class Chaining_Consumer_Concept {

	public static void main(String[] args) {

		Consumer<Movie> c1 = m -> System.out.println(m.name + " Ready To Release");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " Ready To Release But it is bigger Flop!!!");
		Consumer<Movie> c3 = m -> System.out.println(m.name + " Stroing the Information Into the database");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		
		Movie movie = new Movie("Spide-Man");
		cc.accept(movie);
		
	}

}

class Movie {
	String name;

	public Movie(String name) {

		this.name = name;

	}
}
