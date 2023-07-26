package Vehicle;

public class Main {

	public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver("John");

        // Vehicle 객체들 생성
        Vehicle bus = new Bus("City Bus", 30, 0);
        Vehicle airplane = new Airplane("Boeing 747", 200, 0);
        Vehicle tank = new Tank("M1 Abrams", 50, 0);

        // drive 메소드 테스트
        driver.drive(); // 운전할 Vehicle 객체가 없습니다.
//        ((Driveable)driver).drive(bus);

        // Vehicle 배열 생성
        Vehicle[] vehicles = {bus, airplane, tank};

        driver.drive(vehicles);

        // 총 주행거리 출력
        System.out.println("총 주행거리: " + driver.getTotalDistance() + "km");
    }

}
