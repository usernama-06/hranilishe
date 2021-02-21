package bike;

public class Mtb extends BikeSpec implements Bicycle {

    public String vendor ="haro";
    public String bikeType ="MTB";
    public int wheelSize = 26;
    public int chainRingSize = 15;
    public int chainRingsCount;
    public String forkType;
    public int speed;

    public Mtb() {

    }

    public void ride() {
        System.out.println("i'm");
    }
}
