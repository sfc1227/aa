package Vehicle;

public class Bus extends Vehicle {
    public Bus(String name, int fuelAmount, int totalDistance) {
        super(name, fuelAmount, totalDistance, 12.0); // ������ ����� 12.0
    }

    @Override
    public int move() {
        System.out.println("�θ��θ�~~~");
        return super.move();
    }
}
