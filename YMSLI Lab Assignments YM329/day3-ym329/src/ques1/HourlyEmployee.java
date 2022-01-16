package ques1;

public class HourlyEmployee extends Employee{
	private double hoursWorkedPerWeek;
	private double hourlyRate;
	
	public HourlyEmployee(String empName, String empId, double hoursWorkedPerWeek, double hourlyRate) {
		super(empName, empId);
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
		this.hourlyRate = hourlyRate;
	}
	public double getWeeklySalary(){
		return (hoursWorkedPerWeek * hourlyRate);
	}
	public void setRate(double rate) {
		this.hourlyRate = rate;
	}
	public void increaseSalary(int percentage) {
		this.hourlyRate += this.hourlyRate*percentage;
	}
	public double getPayment() {
		return getWeeklySalary();
	}
}
