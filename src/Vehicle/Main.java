package Vehicle;

public class Main {

	public static void main(String[] args) {
        // Driver ��ü ����
        Driver driver = new Driver("John");

        // Vehicle ��ü�� ����
        Vehicle bus = new Bus("City Bus", 30, 0);
        Vehicle airplane = new Airplane("Boeing 747", 200, 0);
        Vehicle tank = new Tank("M1 Abrams", 50, 0);

        // drive �޼ҵ� �׽�Ʈ
        driver.drive(); // ������ Vehicle ��ü�� �����ϴ�.
//        ((Driveable)driver).drive(bus);

        // Vehicle �迭 ����
        Vehicle[] vehicles = {bus, airplane, tank};

        driver.drive(vehicles);

        // �� ����Ÿ� ���
        System.out.println("�� ����Ÿ�: " + driver.getTotalDistance() + "km");
    }

}
