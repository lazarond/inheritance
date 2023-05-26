package oop_inheritance;

public class ToyotaVios extends Vehicles {
	
	String tireType = "Highway Tires";
	
	void drive() {
		
		System.out.println("The car was moving forward.");
		
	}
	
	//overrides the stop method from the Vehicle class
	@Override
	void stop() {
		
		System.out.println("The car has stopped.");
		
	}
	
}



