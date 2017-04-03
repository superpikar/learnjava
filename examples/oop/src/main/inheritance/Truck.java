package inheritance;

import encapsulation.Vehicle;

public class Truck extends Vehicle {
	private int numberOfWheels;
	
	public Truck(String name, int numberOfWheels) {
		super(name);
		this.numberOfWheels = numberOfWheels;
	}
	
	public void printName(){
		System.out.println("vehicle name: "+name+", have "+numberOfWheels+" legs");
	}
}
