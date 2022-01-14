package ques3;

public class CurrentAccount extends Account{
	private int tradeLicenseNumber;
	public CurrentAccount(int tradeLicenseNumber , String memberName, double accountBalance) {
		super(memberName, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	public double getBalance() {
		return this.accountBalance;
	}
	public void withdraw(double amount) {
		if(amount < this.accountBalance) {
			this.accountBalance -= amount;
		}
		else {
			System.out.println("Invalid Withdraw Amount");
		}
	}
}