package bike;

public class Bmx extends BikeSpec implements Bicycle {

    @Override
    public void ride() {
        System.out.println("riding bmx");
    }
}