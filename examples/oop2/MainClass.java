import compositionoverinheritance.HyundaiCityCar;
import compositionoverinheritance.IDriftingImpl;
import abstractt.SportCar;
import inheritance.KiaCityCar;
import inheritance.Truck;
import inheritanceinterface.SuperFutureCar;
import interfacee.Airplane;
import encapsulation.Vehicle;

public class MainClass {
	private static void printLine(){
		System.out.println("----------------");
	}
	public static void main(String[] args){
		// encapsulation running sample
		Vehicle v = new Vehicle("vehicle");
		v.printName();
		printLine();
		
		// inheritance running sample
		Truck t = new Truck("ford truck", 12);
		t.printName();
		printLine();
		
		// interface running sample
		Airplane a = new Airplane("F14");
		a.printName();
		a.fly();
		printLine();
		
		// abtraction running sample
		SportCar sc = new SportCar("Jaguar-F");
		sc.printName();
		sc.runOnTheStreet();
		printLine();
		
		// interface and inheritance running sample
		SuperFutureCar sfc = new SuperFutureCar("KilatSuper");
		sfc.printName();
		sfc.runOnTheStreet();
		sfc.fly();
		printLine();
		
		// other inheritance running sample
		KiaCityCar ksc = new KiaCityCar("picanto", "160km/h");
		ksc.move();
		ksc.drift();
		printLine();
		
		// other inheritance running sample
		HyundaiCityCar hcc = new HyundaiCityCar("sonata", "300km/h", new IDriftingImpl("forward", "right"));
		hcc.move();
		hcc.drift();
		printLine();
	}
}
