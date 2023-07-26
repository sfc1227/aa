package Vehicle;

public class Airplane extends Vehicle {
    public Airplane(String name, int fuelAmount, int totalDistance) {
        super(name, fuelAmount, totalDistance, 0.1); // 비행기의 연비는 0.1
    }

    @Override
    public int move() {
        System.out.println("슈우우우웅~~~");
        return super.move();
    }
}
