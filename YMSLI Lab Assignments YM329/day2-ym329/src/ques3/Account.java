package ques3;

import java.util.Random;

public class Account{
	protected String memberName;
	protected String accountNumber;
	protected double accountBalance;
	public Account(String memberName, double accountBalance) {
		Random rand = new Random();
		String accountNumber = 10000 + rand.nextInt(89999)+"";
		this.accountNumber = accountNumber;
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}	
	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	
	public double getBalance() {
		return this.accountBalance;
	}	
	public void withdraw(double amount) {}
}


