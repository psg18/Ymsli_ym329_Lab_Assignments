package ques3;

public class SavingsAccount extends Account{
	private int interest = 5;
	public int minBalance = 500;
	private int max_withdrawal_limit;
	public SavingsAccount(int maxWithdrawalLimit, String memberName, double accountBalance) {
		super(memberName, accountBalance);
		this.max_withdrawal_limit = maxWithdrawalLimit;
	}
	public double getBalance() {
		return (this.accountBalance + ((this.accountBalance*this.interest)/100) );
	}
	public void withdraw(double amount) {
		if(amount < max_withdrawal_limit && this.accountBalance-amount > minBalance) {
			this.accountBalance -= amount;
		}
		else {
			System.out.println("Invalid Withdraw Amount");
		}
	}
}
