package ques5;

public class Convertible extends Car{
	private boolean isHoodOpen;
	
	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}
	@Override
	public void display() {
		System.out.println("\nModel: "+model);
		System.out.println("Make : "+make);
		System.out.println("No of Door: "+noOfDoor);
		System.out.println("Hoop open: "+isHoodOpen);
	}	
}
