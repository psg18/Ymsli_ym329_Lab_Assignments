package question3;

import java.util.*;

public class BookCollection {

	public static void main(String[] args) {
		
		HashSet<Book> booksCollection = new HashSet<>();
		
		booksCollection.add(new Book("Book 1", "Author 1"));
		booksCollection.add(new Book("Book 2", "Author 2"));
		booksCollection.add(new Book("Book 3", "Author 3"));
		booksCollection.add(new Book("Book 4", "Author 4"));
		booksCollection.add(new Book("Book 5", "Author 5"));
		
		TempBookCollection bookCollection = new TempBookCollection("Books Set", booksCollection);
		bookCollection.hasBook(new Book("Book 5", "Author 6"));
		
		System.out.println(bookCollection);
		
		bookCollection.sortBookSet();
		
	}

}