package interfacee;

public class Airplane implements IFlyable {
	private String name;
	
	public Airplane(String name) {
		this.name = name;
	}
	
	public void printName(){
		System.out.println("vehicle name: "+name);
	}
	
	@Override
	public void fly() {
		System.out.println(name+" can fly!");
	}
}
