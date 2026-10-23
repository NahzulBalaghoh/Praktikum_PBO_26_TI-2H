package UTS;

public class PatrolRobot extends Robot {
    public battery Robotbattery;

    public PatrolRobot(String Name, int cpuSpeed, int power, battery battery) {
        this.Name = "PATROL 18 " + Name;
        this.cpuSpeed = cpuSpeed;
        this.power = power;
        this.Robotbattery = battery;
    }

    public void increasePower() {
        this.power += 20;
    }
    
}
