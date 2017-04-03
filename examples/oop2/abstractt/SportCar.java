package abstractt;

public class SportCar extends AbstractCar {

	public SportCar(String name) {
		super(name);
	}

	@Override
	public void runOnTheStreet() {
		System.out.println(name+" is running on the street!");
	}
}
