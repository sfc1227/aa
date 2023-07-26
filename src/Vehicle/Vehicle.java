package Vehicle;

abstract class Vehicle implements Moveable {
    private String name;
    private int fuelAmount; // ���ᷮ (����)
    private int totalDistance; // ���� ����Ÿ� (km)
    private double fuelEfficiency; // ���� (���ʹ� ����Ÿ�)

    public Vehicle(String name, int fuelAmount, int totalDistance, double fuelEfficiency) {
        this.name = name;
        this.fuelAmount = fuelAmount;
        this.totalDistance = totalDistance;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getName() {
        return name;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    @Override
    public int move() {
        int distance = 10; // �̵��Ÿ� 10km
        int requiredFuel = (int) Math.ceil(distance / fuelEfficiency); // �ʿ��� ���� ��� (�ø� ó��)
        if (requiredFuel <= fuelAmount) {
            fuelAmount -= requiredFuel;
            totalDistance += distance;
            return distance;
        } else {
            int maxDistance = (int) Math.floor(fuelAmount * fuelEfficiency); // �ִ� ���� ���� �Ÿ�
            fuelAmount = 0;
            totalDistance += maxDistance;
            return maxDistance;
        }
    }
}
