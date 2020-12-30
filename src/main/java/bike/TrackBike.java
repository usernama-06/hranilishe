package bike;

public class TrackBike extends BikeSpec implements Bicycle {



    @Override
    public void ride() {
        System.out.println("riding Trackbike");
    }
}

