package inheritance;

/**
 * inheritance sample, inspired by http://www.programcreek.com/2014/05/inheritance-vs-composition-in-java/
 * @author @superpikar
 *
 */
public class KiaCityCar extends CityCar {

	public KiaCityCar(String type, String maxSpeed) {
		super(type, maxSpeed);
	}
	
	public void move(){
		System.out.println("kia "+getType()+" move forward");
	}
	
	public void drift(){
		move();
		super.drift();
	}

}
