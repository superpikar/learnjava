package inheritanceinterface;

import interfacee.IFlyable;
import abstractt.AbstractCar;

public class SuperFutureCar extends AbstractCar implements IFlyable {

	public SuperFutureCar(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(name+" is flying");
	}

	@Override
	public void runOnTheStreet() {
		System.out.println(name+" is running on the street");
	}

}
