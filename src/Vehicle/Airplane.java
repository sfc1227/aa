package Vehicle;

public class Airplane extends Vehicle {
    public Airplane(String name, int fuelAmount, int totalDistance) {
        super(name, fuelAmount, totalDistance, 0.1); // ������� ����� 0.1
    }

    @Override
    public int move() {
        System.out.println("�������~~~");
        return super.move();
    }
}
