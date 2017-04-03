package compositionoverinheritance;

/**
 * composition over inheritance sample, inspired by http://www.programcreek.com/2014/05/inheritance-vs-composition-in-java/
 * @author @superpikar
 *
 */
public class CityCar2 {
	private String type;
	private String maxSpeed;
	
	public CityCar2(String type, String maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
