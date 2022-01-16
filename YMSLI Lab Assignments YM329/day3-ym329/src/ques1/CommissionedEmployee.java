package ques1;

public class CommissionedEmployee extends Employee{
	private double totalWeeklySale;
	private double rate;
	
	public CommissionedEmployee(String empName, String empId, double totalWeeklySale, double rate) {
		super(empName, empId);
		this.totalWeeklySale = totalWeeklySale;
		this.rate = rate;
	}
	public double getWeeklySalary() {
		return ((rate*totalWeeklySale)/100);
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void increaseSalary(int percentage) {
		this.rate += (this.rate * percentage);
	}
	public double getPayment() {
		return getWeeklySalary();
	}
}
