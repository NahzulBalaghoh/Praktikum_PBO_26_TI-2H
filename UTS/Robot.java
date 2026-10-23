package UTS;

public class Robot {
    public String Name;
    public int cpuSpeed;
    public int power;

    public void increasePower() {
        this.power += 10;
    }

    public void reducePower() {
        this.power -= 10;
    }
}
