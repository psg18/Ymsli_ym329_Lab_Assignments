package ques5;

public class ques5 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(4,4,2022,"Mahindra");
		Vehicle car = new Car(4,4,2021,"Ford",4);
		Vehicle convertible = new Convertible(4, 4, 2020, "Mercedes", 4, true);
		Vehicle sportscar = new SportCar(4, 2, 2021, "Porsche");
		
		vehicle.display();
		car.display();
		convertible.display();
		sportscar.display();
	}

}
