package Vehicle;

abstract class Vehicle implements Moveable {
    private String name;
    private int fuelAmount; // 연료량 (리터)
    private int totalDistance; // 누적 주행거리 (km)
    private double fuelEfficiency; // 연비 (리터당 주행거리)

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
        int distance = 10; // 이동거리 10km
        int requiredFuel = (int) Math.ceil(distance / fuelEfficiency); // 필요한 연료 계산 (올림 처리)
        if (requiredFuel <= fuelAmount) {
            fuelAmount -= requiredFuel;
            totalDistance += distance;
            return distance;
        } else {
            int maxDistance = (int) Math.floor(fuelAmount * fuelEfficiency); // 최대 주행 가능 거리
            fuelAmount = 0;
            totalDistance += maxDistance;
            return maxDistance;
        }
    }
}
