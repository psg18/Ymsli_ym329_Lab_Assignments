package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TempBookCollection {

	private String bookOwnerName;
	private HashSet<Book> ownerBookSet;

	TempBookCollection(String bookOwnerName, HashSet<Book> ownerBookSet) {
		this.bookOwnerName = bookOwnerName;
		this.ownerBookSet = ownerBookSet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TempBookCollection [bookOwnerName=");
		builder.append(bookOwnerName);
		builder.append(", ownerBookSet=");
		builder.append(ownerBookSet);
		builder.append("]");
		return builder.toString();
	}

	public void hasBook(Book b) {
		if (ownerBookSet.contains(b)) {
			System.out.println("Requested Book" + b.getBookTitle() + "is present.");
		} else {
			System.out.println("Requested Book " + b.getBookTitle() + " is not present.");
		}
	}

	public void sortBookSet() {

		List<Book> booksList = new ArrayList<Book>();

		for (Book book1 : ownerBookSet)
			booksList.add(book1);

		Collections.sort(booksList);
		System.out.println();
		for (Book book2 : booksList) {
			System.out.println("Title of the Book is: " + book2.getBookTitle() + " and The author of the Book is: "
					+ book2.getBookAuthor());
		}

	}

}