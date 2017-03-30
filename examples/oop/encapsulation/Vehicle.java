package encapsulation;

/**
 * sample of encapsulation
 */
public class Vehicle {
	protected String name;
	
	public Vehicle(String name){
		this.name = name;
	}
	
	// private function
	private String printTheName(){
		return "vehicle name: "+name;
	}
	
	// public function, accesible to other class
	public void printName(){
		System.out.println(printTheName());
	}
}
