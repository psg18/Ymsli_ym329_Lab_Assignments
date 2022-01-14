package ques2;

public class Book{
    public String bookTitle;
    public String author;
    public String ISBN;
    public int numberofCopies;
    
    public Book(String bookTitle, String author, String ISBN, int numberofCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.numberofCopies = numberofCopies;
    }
    
    public void display() {
        System.out.println(bookTitle+"-"+author+"-"+ISBN+"-"+numberofCopies);
    }   
}