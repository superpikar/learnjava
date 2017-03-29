public class MainClass {
	public static void main(String[] args){
		Vehicle v = new Vehicle("vehicle");
		v.printName();
		
		Truck t = new Truck("ford truck", 12);
		t.printName();
		
		Airplane a = new Airplane("F14");
		a.printName();
		a.fly();
		
		SportCar sc = new SportCar("Jaguar-F");
		sc.printName();
		sc.runOnTheStreet();
		
		SuperFutureCar sfc = new SuperFutureCar("KilatSuper");
		sfc.printName();
		sfc.runOnTheStreet();
		sfc.fly();
	}
}
