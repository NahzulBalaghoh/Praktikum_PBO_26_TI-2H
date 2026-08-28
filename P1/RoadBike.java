package P1;

public class RoadBike extends Bike{
    private int tireWidh;

    public void setTireWeidth(int width){
        tireWidh = width;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width : " + tireWidh + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
