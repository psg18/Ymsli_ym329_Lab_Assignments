package ques1;

public class SalariedEmployee extends Employee{
	private double weeklyRate;
	
	public SalariedEmployee(String empName, String empId, double weeklyRate) {
		super(empName, empId);
		this.weeklyRate = weeklyRate;
	}
	public double getWeeklySalary() {
		return weeklyRate;
	}
	public void setRate(double rate) {
		this.weeklyRate = rate;
	}
	public void increaseSalary(int percentage) {
		this.weeklyRate += this.weeklyRate*percentage/100;
	}
	public double getPayment() {
		return getWeeklySalary();
	}
}
