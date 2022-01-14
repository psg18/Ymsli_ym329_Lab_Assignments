package ques5;

public class Car extends Vehicle{
	protected int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}	
	
	@Override
	public void display() {
		System.out.println("\nModel: "+model);
		System.out.println("Make : "+make);
		System.out.println("No of Door: "+noOfDoor);
	}
	
}
