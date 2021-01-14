import bike.Bmx;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    void howToRideTest() {
        Bmx bmx = new Bmx();
        Assert.assertEquals(bmx.howToRide(), "just pedal");
    }
}