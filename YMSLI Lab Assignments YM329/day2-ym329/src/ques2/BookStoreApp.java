package ques2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		
        int choice;
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();
        while(true) {
        	
            System.out.println("\n1) Display all Books");
            System.out.println("2) Order Book");
            System.out.println("3) Sell Book");
            System.out.println("Press 0 to Exit!");
 
            System.out.println("Make your choice");
            choice = scanner.nextInt();
 
            switch (choice) {
 
                case 1:
                	bookStore.display();
                    break;
 
                case 2:
                    System.out.println("Enter ISBN Number : ");
                    String isbn = scanner.next();
                    System.out.println("Enter Number of copies: ");
                    int noOfCopies = scanner.nextInt();
                    bookStore.order(isbn, noOfCopies);
                    break;
 
                case 3:
                	System.out.println("Enter Book Title : ");
                    String title = scanner.next();
                    System.out.println("Enter Number of copies: ");
                    int numberOfCopies = scanner.nextInt();
                    bookStore.sell(title, numberOfCopies);
                    break;
 
                case 0:
                    System.exit(0);
 
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }
		
	}

}
