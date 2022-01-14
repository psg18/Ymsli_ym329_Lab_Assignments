package ques3;

import java.util.Random;
import java.util.Scanner;


public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Creating Account");
		System.out.println("Enter User Name: ");
		String name = sc.next();
		System.out.println("Enter Account type: ");
		String accountType = sc.next();
		System.out.println("Enter initial amount: ");
		int initBalance = sc.nextInt();
		Account account = null;
		if(accountType.equals("savings")) { 
			int maxWithdrawalLimit = 10000;
		    account = new SavingsAccount(maxWithdrawalLimit, name, initBalance);
		}
		else if(accountType.equals("current")) {
			System.out.println("Enter Trade License Number : ");
			int tradeLicenseNumber = sc.nextInt();
			account = new CurrentAccount(tradeLicenseNumber,name, initBalance);
		}
		
        int choice;
        while(true) {
        	
            System.out.println("\n1) Deposit Money");
            System.out.println("2) Withdraw Money");
            System.out.println("3) Display Balance");
            System.out.println("Press 0 to Exit!");
 
            System.out.println("Make your choice");
            choice = sc.nextInt();
 
            switch (choice) {
 
                case 1:
                	System.out.println("Enter Amount to deposit: ");
                	int depositAmount = sc.nextInt();
                	System.out.println("want to see balance ? (yes/no):");
                	String seeBalance = sc.next();
                	if(seeBalance.equals("yes")) {
                		System.out.println("Balance before Deposit: "+account.getBalance());
                		account.deposit(depositAmount);
                		System.out.println("Balance after Deposit: "+account.getBalance());
                	}
                	else {
                		account.deposit(depositAmount);
                	}
                	break;
 
                case 2:
                	System.out.println("Enter Amount to withdraw: ");
                	double withdrawAmount = sc.nextDouble();
            		double prevBalance = account.getBalance();
            		account.withdraw(withdrawAmount);
            		
                	System.out.println("want to see balance ? (yes/no):");
                	seeBalance = sc.next();
                	if(seeBalance.equals("yes")) {
                		System.out.println("Balance before Withdrawal: "+prevBalance);
                		System.out.println("Balance after Withdrawal: "+account.getBalance());
                	}
                	else {
                		account.withdraw(withdrawAmount);
                	}
                	break;
 
                case 3:
            		System.out.println("Balance : "+account.getBalance());
                    break;
 
                case 0:
                    System.exit(0);
 
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }

		

	}

}
