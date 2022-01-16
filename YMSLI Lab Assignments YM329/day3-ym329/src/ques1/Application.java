package ques1;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		
		Employee emp1 = new SalariedEmployee("Paras", "ym329", 10000.00);
		employees.add(emp1);
		Employee emp2 = new HourlyEmployee("John", "ym617", 38, 300.00);
		employees.add(emp2);
		Employee emp3 = new CommissionedEmployee("Steve", "ym768",15000.00 ,77.00);
		employees.add(emp3);
		
		System.out.println("EMPLOYEE SYSTEM");
		System.out.println("Id: "+emp1.getId()+" Total Payment: "+emp1.getPayment());
		System.out.println("Id: "+emp2.getId()+" Total Payment: "+emp2.getPayment());
		System.out.println("Id: "+emp3.getId()+" Total Payment: "+emp3.getPayment());
		
		System.out.println("\nINVOICE SYSTEM");
		Invoice invoice = new Invoice("Mouse","1000DPI USB Wired Optical Mouse",3,700.0);
		System.out.println("Invoice Total Payment : "+invoice.getPayment());
		
		int option=1;
		
		while(option!=0)
		{
			System.out.println("\nChoose Option: ");
			System.out.println("1. Calculate Salary for Employee: ");
			System.out.println("2. Increase Salary for Employee: ");
			System.out.println("3. Set Rate for Employee: ");
			System.out.println("Enter 0 to exit.");
			option=sc.nextInt();
			
			if(option==0){
				System.exit(0);
			}
			else if(option==1) {
				System.out.println("Enter Employee ID : ");
				String id = sc.next();
				boolean found =false;
				for(Employee emp : employees ) {
					if(emp.getId().equals(id)) {
						System.out.println("Weekly Salary : "+emp.getWeeklySalary());
						found=true;
					}
				}
				if(found==false) {
					System.out.println("Employee not found!");
				}
			}
			else if(option==2) {
				System.out.println("Enter Employee ID : ");
				String id = sc.next();
				boolean found =false;

				for(Employee emp : employees ) {
					if(emp.getId().equals(id)) {
						System.out.println("Enter Percentage Increase : ");
						int percentage = sc.nextInt();
						emp.increaseSalary(percentage);
						found=true;
						System.out.println("Salary after Increment: "+emp.getWeeklySalary());
					}
				}
				if(found==false) {
					System.out.println("Employee not found!");
				}
			}
			else if(option==3) {
				System.out.println("Enter Employee ID : ");
				String id = sc.next();
				boolean found =false;

				for(Employee emp : employees ) {
					if(emp.getId().equals(id)) {
						System.out.println("Enter Rate : ");
						double rate = sc.nextDouble();
						found=true;
						emp.setRate(rate);
					}
				}
				if(found==false) {
					System.out.println("Employee not found!");
				}
			}else {
				System.out.println("Invalid Choice!!");
			}
			
		}
	}

}
