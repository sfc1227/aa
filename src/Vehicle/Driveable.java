package Vehicle;

public interface Driveable {
	void drive();
	
	public default void drive(Moveable m) {
		m.move();
	}
}
