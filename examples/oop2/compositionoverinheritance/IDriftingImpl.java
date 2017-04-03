package compositionoverinheritance;

/**
 * composition over inheritance sample, inspired by http://www.programcreek.com/2014/05/inheritance-vs-composition-in-java/
 * @author @superpikar
 *
 */
public class IDriftingImpl implements IDrifting {
	
	private String move;
	private String drift;
	
	public IDriftingImpl(String move, String drift) {
		this.move = move;
		this.drift = drift;
	}
	
	@Override
	public void move() {
		System.out.println("move to "+move);

	}

	@Override
	public void drift() {
		move();
		System.out.println("turn "+drift);

	}

}
