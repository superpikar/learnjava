package compositionoverinheritance;

/**
 * composition over inheritance sample, inspired by http://www.programcreek.com/2014/05/inheritance-vs-composition-in-java/
 * @author @superpikar
 *
 */
public class HyundaiCityCar extends CityCar2 implements IDrifting{
	private IDrifting drifting;
	
	public HyundaiCityCar(String type, String maxSpeed, IDrifting drifting) {
		super(type, maxSpeed);
		this.drifting = drifting;
	}

	public void move() {		
		drifting.move();
	}

	public void drift() {
		drifting.drift();
	}

}
