package inheritance;

/**
 * inheritance sample, inspired by http://www.programcreek.com/2014/05/inheritance-vs-composition-in-java/
 * @author @superpikar
 *
 */
class CityCar{
	private String type;
	private String maxSpeed;
	
	public CityCar(String type, String maxSpeed){
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
	
	public void move(){
		System.out.println(getType()+" move forward");
	}
	
	public void drift(){
		move();
		System.out.println(getType()+" turn left");
	}
}