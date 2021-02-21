package bike;

public class TrackBike extends BikeSpec implements Bicycle {

    public String vendor;
    public String bikeType;
    public int wheelSize;
    public int chainRingSize;
    public int chainRingsCount;
    public String forkType;
    public int speed;


    public void ride() {
        System.out.println("i am");
    }
}


