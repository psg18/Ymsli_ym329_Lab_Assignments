package ques5;

public class Vehicle{
	protected int noOfWheel;
	protected int noOfPassenger;
	protected int model;
	protected String make;
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	public void display() {
		System.out.println("\nNo of Wheels: "+noOfWheel);
		System.out.println("No of Passengers: "+noOfPassenger);
		System.out.println("Model: "+model);
		System.out.println("Make : "+make);
	}
}
