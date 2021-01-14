import bike.BikeSpec;
import bike.Bmx;
import bike.TrackBike;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FirstTest {

    @Test
    void howToRideTest() {
        Bmx bmx = new Bmx();
        Assert.assertEquals(bmx.howToRide(), "just pedal");
    }
}

