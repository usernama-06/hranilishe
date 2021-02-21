package bike;

import sun.jvm.hotspot.utilities.Assert;

public class Bmx extends BikeSpec implements Bicycle {


    public String vendor;
    public String bikeType = "BMX";
    public int wheelSize = 20;
    public int chainRingSize;
    public int chainRingsCount;
    public String forkType = "HardFork";
    public int speed;

    public void ride() {
        System.out.println("i'm bmx");




    }
}
