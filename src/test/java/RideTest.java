import bike.Bmx;
import bike.TrackBike;

public class RideTest {
    public static void main(String[] args) {
        Bmx bmx = new Bmx();
        TrackBike trackBike = new TrackBike();
        bmx.setJumpHight(40);
        trackBike.setSpeed(60);
        bmx.doWhatYouCan();
        trackBike.doWhatYouCan();


    }
}

