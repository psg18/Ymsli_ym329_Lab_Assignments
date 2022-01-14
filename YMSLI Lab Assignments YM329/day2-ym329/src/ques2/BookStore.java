package ques2;

import java.util.Scanner;

public class BookStore{
    private Book books[] = new Book[10];
    public void sell(String bookTitle, int noOfCopies) {
    	int i=0;
    	boolean found=false;
    	while(books[i]!=null && found==false) {            
    		if(bookTitle.equals(books[i].bookTitle)) {
    			books[i].numberofCopies -= noOfCopies;
    			found=true;
            }
    		i++;
        }
        if(found==false) {
            System.out.println("Book not found");
        }
    }
    public void order(String isbn, int noOfCopies) {
    	int i=0;
    	boolean found = false;
    	while(books[i]!=null && found==false) {
	            if(isbn.equals(books[i].ISBN)) {
	                books[i].numberofCopies += noOfCopies;
	                found=true;
	            }
	            i++;
    	}
    	if(found==false){ 
    		System.out.println("Enter Book title : ");
        	Scanner scanner = new Scanner(System.in);
        	String bookTitle = scanner.next();
        	System.out.println("Enter Book author : ");
        	String bookAuthor = scanner.next();
        	
        	Book newb = new Book(bookTitle,bookAuthor,isbn,noOfCopies);
            books[i] = newb;
    	}
    }
    public void display() {
    	int i=0;
    	while(books[i]!=null) {
            books[i].display();
            i++;
    	}
    	if(books[0]==null){
    		System.out.println("No Book Record!");
    	}
    }
}
