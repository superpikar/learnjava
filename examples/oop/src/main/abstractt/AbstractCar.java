package abstractt;

public abstract class AbstractCar {
	protected String name;
	
	public AbstractCar(String name){
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
	
	public abstract void runOnTheStreet();
}
