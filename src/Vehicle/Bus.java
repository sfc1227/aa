package Vehicle;

public class Bus extends Vehicle {
    public Bus(String name, int fuelAmount, int totalDistance) {
        super(name, fuelAmount, totalDistance, 12.0); // ¹ö½ºÀÇ ¿¬ºñ´Â 12.0
    }

    @Override
    public int move() {
        System.out.println("ºÎ¸ªºÎ¸ª~~~");
        return super.move();
    }
}
