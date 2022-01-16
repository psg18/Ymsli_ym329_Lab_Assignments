package ques1;

public abstract class Employee implements Payable{
	
	private String empName;
	private String empId;
	
	public Employee(String empName, String empId) {
		this.empName = empName;
		this.empId = empId;
	}
	
	public String getId() {
		return this.empId;
	}
	public abstract double getWeeklySalary();
	public abstract void setRate(double rate);
	public abstract void increaseSalary(int percentage);
}
