package Vehicle;

public class Driver {
    private String name;
    private int totalDistance; // 총 주행거리

    public Driver(String name) {
        this.name = name;
        this.totalDistance = 0;
    }

    public void drive() {
        System.out.println("운전할 Vehicle 객체가 없습니다.");
    }

    public void drive(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            drive(v);
        }
    }

    public void drive(Vehicle v) {
        if (v != null) {
            totalDistance += v.move();
        } else {
            System.out.println("운전할 Vehicle 객체가 없습니다.");
        }
    }

    public void drive(Bus b) {
        b.move();
        totalDistance += b.getTotalDistance();
    }

    public void drive(Airplane a) {
        a.move();
        totalDistance += a.getTotalDistance();
    }

    public void drive(Tank t) {
        t.move();
        totalDistance += t.getTotalDistance();
    }

    public int getTotalDistance() {
        return totalDistance;
    }
}
