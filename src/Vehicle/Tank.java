package Vehicle;

public class Tank extends Vehicle {
    public Tank(String name, int fuelAmount, int totalDistance) {
        super(name, fuelAmount, totalDistance, 4.0); // ÅÊÅ©ÀÇ ¿¬ºñ´Â 4.0
    }

    @Override
    public int move() {
        System.out.println("ÅÊÅ©ÅÊÅ©ÅÊÅ©~~");
        return super.move();
    }
}
