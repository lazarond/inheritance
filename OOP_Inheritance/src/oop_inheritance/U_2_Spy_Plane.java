package oop_inheritance;

public class U_2_Spy_Plane extends Vehicles {

		int wingspan = 103;
	
	void fly() { //to make the plane take off
		
		System.out.println("The plane is taking off.");
		
	}
	
	//overrides the stop method from the Vehicle class
	@Override
	void stop() {
		
		//method to land the plane
		System.out.println("The plane landed.");
		
	}
}

