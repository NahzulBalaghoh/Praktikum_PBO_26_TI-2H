package UTS;

public class TestPatrolRobot {
    public static void main(String[] args) {
        battery batt = new battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150, new battery(16000));

        pr.increasePower();

        System.out.println("Name: " + pr.Name);
        System.out.println("CPUSpeed: " + pr.cpuSpeed );
        System.out.println("Power: " + pr.power );
        System.out.println("Battery Capacity: " + pr.Robotbattery.Capacity);

    }
}
