package Vehicle;

public class Tank extends Vehicle {
    public Tank(String name, int fuelAmount, int totalDistance) {
        super(name, fuelAmount, totalDistance, 4.0); // ��ũ�� ����� 4.0
    }

    @Override
    public int move() {
        System.out.println("��ũ��ũ��ũ~~");
        return super.move();
    }
}
